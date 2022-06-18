package com.company.service.imp;

import com.company.join.Dept;
import com.company.mapper.DeptMapper;
import com.company.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImp implements DeptService {

    private DeptMapper deptMapper;

    @Autowired
    public void setDeptMapper(DeptMapper deptMapper) {
        this.deptMapper = deptMapper;
    }

    @Override
    public Dept getDeptById(Integer did) {
        return deptMapper.getDeptById(did);
    }

    @Override
    public List<Dept> getAllDept() {
        return deptMapper.getAllDept();
    }

    @Override
    public Integer addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Integer deleteDeptById(Dept dept) {
        return deptMapper.deleteDeptById(dept);
    }

    @Override
    public Integer updateDeptNameById(Dept dept) {
        return deptMapper.updateDeptNameById(dept);
    }


}
