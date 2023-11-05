package com.example.mongodbcollections;

import com.example.mongodbcollections.dto.request.EmpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public String addEmp(EmpRequest empRequest) {
        Employee employee = EmpTransformer.EmployeeRequestToEmployee(empRequest);

        employeeRepository.save(employee);

        return "Employee added successfully!!!";

    }
}
