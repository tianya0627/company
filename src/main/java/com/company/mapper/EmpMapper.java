package com.company.mapper;

import com.company.join.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tiany
 * @description 针对表【emp】的数据库操作Mapper
 * @createDate 2022-06-18 00:21:11
 * @Entity com.company.join.Emp
 */
@Mapper
public interface EmpMapper {

    /**
     * 根据ID查询员工
     *
     * @param eid 员工编号
     * @return 员工
     */
    Emp getEmpById(@Param("eid") Integer eid);

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




