package com.example.mongodbcollections;

import com.example.mongodbcollections.dto.request.EmpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmp")
    public ResponseEntity addEmp(@RequestBody EmpRequest empRequest){
        String response = employeeService.addEmp(empRequest);

        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

//    @GetMapping("/getEmp")
//    public ResponseEntity getEmp()
}
