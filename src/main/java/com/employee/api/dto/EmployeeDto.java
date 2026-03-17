package com.employee.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {
    private Long id;

    @NotBlank(message = "직원 firstName은 필수 입력 항목입니다.")
    private String firstName;

    @NotBlank(message = "직원 lastName은 필수 입력 항목입니다.")
    private String lastName;

    @NotBlank(message = "직원 email은 필수 입력 항목입니다.")
    @Email
    private String email;

    @NotNull(message = "직원의 부서코드는 필수 입력 항목입니다.")
    @Positive(message = "올바른 부서 코드가 아닙니다.")
    private Long departmentId;

    private DepartmentDto departmentDto;

}