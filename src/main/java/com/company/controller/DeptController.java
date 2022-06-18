package com.company.controller;

import com.company.join.Dept;
import com.company.join.Emp;
import com.company.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    private DeptService deptService;

    @Autowired
    public void setDeptService(DeptService deptService) {
        this.deptService = deptService;
    }

    @GetMapping("getDeptById")
    public Dept getDeptById(Dept dept){
        return deptService.getDeptById(dept.getDid());
    }

    @GetMapping("getAllDept")
    public List<Dept> getAllDept(){
        return deptService.getAllDept();
    }
}
