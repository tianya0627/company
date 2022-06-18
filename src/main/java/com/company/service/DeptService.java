package com.company.service;


import com.company.join.Dept;

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

    /**
     * 添加部门
     *
     * @param dept 需要添加的部门
     * @return 结果
     */
    Integer addDept(Dept dept);

    /**
     * 根据Id删除部门
     *
     * @param dept 需要删除的部门
     * @return 结果
     */
    Integer deleteDeptById(Dept dept);

    /**
     * 根据部门ID修改部门名称
     *
     * @param dept 修改后的部门
     * @return 结果
     */
    Integer updateDeptNameById(Dept dept);
}
