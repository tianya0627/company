package com.company.controller;

import com.company.join.Dept;
import com.company.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DeptController {

    private DeptService deptService;

    @Autowired
    public void setDeptService(DeptService deptService) {
        this.deptService = deptService;
    }

    @GetMapping("Dept")
    public Dept getDeptById(Dept dept){
        return deptService.getDeptById(dept.getDid());
    }

    @GetMapping("AllDept")
    public List<Dept> getAllDept(){
        return deptService.getAllDept();
    }

    @PutMapping("Dept")
    public Map<String,Object> addDept(Dept dept){
        int a = deptService.addDept(dept);
        Map<String,Object> map = new HashMap<>();
        if (a>0){
            map.put("状态","成功");
            map.put("部门ID",dept.getDid());
        }else {
            map.put("状态","失败");
        }
        return map;
    }

    @DeleteMapping("Dept")
    public String deleteDeptById(Dept dept){
        int a=deptService.deleteDeptById(dept);
        if (a>0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    @PostMapping("Dept")
    public String updateDeptNameById(Dept dept){
        int a=deptService.updateDeptNameById(dept);
        if (a>0){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }
}
