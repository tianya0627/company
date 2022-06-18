package com.company.controller;

import com.company.join.Emp;
import com.company.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    private EmpService empService;

    @Autowired
    public void setEmpService(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping("getEmpById")
    public Emp getEmpById(Emp emp){
        return empService.getEmpById(emp.getEid());
    }

    @GetMapping("getAllEmp")
    public List<Emp> getAllEmp(){
        return empService.getAllEmp();
    }
}
