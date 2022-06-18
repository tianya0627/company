package com.company.service.imp;

import com.company.join.Emp;
import com.company.mapper.EmpMapper;
import com.company.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImp implements EmpService {

    private EmpMapper empMapper;

    @Autowired
    public void setEmpMapper(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }

    @Override
    public Emp getEmpById(Integer eid) {
        return empMapper.getEmpById(eid);
    }

    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmp();
    }

    @Override
    public Integer addEmp(Emp emp) {
        return empMapper.addEmp(emp);
    }

    @Override
    public Integer deleteEmpById(Emp emp) {
        return empMapper.deleteEmpById(emp);
    }

    @Override
    public Integer updateEmpById(Emp emp) {
        return empMapper.updateEmpById(emp);
    }
}
