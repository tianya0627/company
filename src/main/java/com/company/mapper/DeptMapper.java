package com.company.mapper;

import com.company.join.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author tiany
* @description 针对表【dept】的数据库操作Mapper
* @createDate 2022-06-18 00:21:11
* @Entity com.company.join.Dept
*/
@Mapper
public interface DeptMapper {

    /**
     * 根据ID查询部门
     *
     * @param did 部门ID
     * @return 部门
     */
    Dept getDeptById(@Param("did") Integer did);

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




