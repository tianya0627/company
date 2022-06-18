package com.company.controller;

import com.company.join.Emp;
import com.company.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class EmpController {

    private EmpService empService;

    @Autowired
    public void setEmpService(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping("Emp")
    public Emp getEmpById(Emp emp) {
        return empService.getEmpById(emp.getEid());
    }

    @GetMapping("AllEmp")
    public List<Emp> getAllEmp() {
        return empService.getAllEmp();
    }

    @PutMapping("Emp")
    public Map<String,Object> addEmp(Emp emp) {
        int a = empService.addEmp(emp);
        Map<String, Object> map = new HashMap<>();
        if (a>0){
            map.put("状态","成功");
            map.put("员工ID",emp.getEid());
        }else {
            map.put("状态","失败");
        }
        return map;
    }

    @DeleteMapping("Emp")
    public String deleteEmpById(Emp emp) {
        int a=empService.deleteEmpById(emp);
        if (a>0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    @PostMapping("Emp")
    public String updateEmpById(Emp emp) {
        int a=empService.updateEmpById(emp);
        if (a>0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }
}
