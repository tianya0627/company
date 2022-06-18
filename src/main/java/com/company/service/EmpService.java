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

    /**
     * 添加员工
     *
     * @param emp 需要添加的员工
     * @return 结果
     */
    Integer addEmp(Emp emp);

    /**
     * 删除员工
     *
     * @param emp 需要删除的员工
     * @return 结果
     */
    Integer deleteEmpById(Emp emp);

    /**
     * 修改员工信息
     *
     * @param emp 修改后的信息
     * @return 结果
     */
    Integer updateEmpById(Emp emp);
}
