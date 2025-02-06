package com.codingshutle.anujTutorial.tutorial.controllers;

import com.codingshutle.anujTutorial.tutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;

@RestController
public class EmployeeController {

    @GetMapping(path = "/employees")
    public EmployeeDTO getEmployees(){
        return new EmployeeDTO(12l,"Anuj",LocalDate.of(2024,1,23),true);
    }

}
