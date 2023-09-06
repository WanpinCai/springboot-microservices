package me.wanpin.organizationservice.service.impl;

import lombok.AllArgsConstructor;
import me.wanpin.organizationservice.dto.OrganizationDto;
import me.wanpin.organizationservice.entity.Organization;
import me.wanpin.organizationservice.mapper.OrganizationMapper;
import me.wanpin.organizationservice.repository.OrganizationRepository;
import me.wanpin.organizationservice.service.OrganizationService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);
        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
