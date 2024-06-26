package edu.icet.employeecrm.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Employee {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String departmentId;

    private String roleId;
}
