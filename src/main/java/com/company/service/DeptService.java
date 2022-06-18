package com.company.service;


import com.company.join.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {
    /**
     * 根据ID查询部门
     *
     * @param did 部门ID
     * @return 部门
     */
    Dept getDeptById(Integer did);

    /**
     * 查询所有部门
     *
     * @return 所有部门
     */
    List<Dept> getAllDept();
}
