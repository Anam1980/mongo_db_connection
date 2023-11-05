package com.example.mongodbcollections;

import com.example.mongodbcollections.dto.request.EmpRequest;

public class EmpTransformer {


    public static Employee EmployeeRequestToEmployee(EmpRequest empRequest) {
        return Employee.builder()
                .empName(empRequest.getName())
                .designation(empRequest.getDesignation())
                .salary(empRequest.getSalary())
                .build();
    }


}
