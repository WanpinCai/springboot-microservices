package me.wanpin.employeeservice.service;

import me.wanpin.employeeservice.dto.APIResponseDto;
import me.wanpin.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
