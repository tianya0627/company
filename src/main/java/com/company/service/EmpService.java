package com.company.service;

import com.company.join.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpService {
    /**
     * 根据ID查询员工
     *
     * @param eid 员工编号
     * @return 员工
     */
    Emp getEmpById(Integer eid);

    /**
     * 查询所有员工
     *
     * @return 所有员工
     */
    List<Emp> getAllEmp();
}
