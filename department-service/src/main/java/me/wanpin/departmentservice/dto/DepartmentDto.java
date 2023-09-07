package me.wanpin.departmentservice.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Schema(
        description = "DepartmentDto Model Information"
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private Long id;

    @Schema(
            description = "Department Name"
    )
    private String departmentName;

    @Schema(
            description = "Department Description"
    )
    private String departmentDescription;

    @Schema(
            description = "Department Code"
    )
    private String departmentCode;

}
