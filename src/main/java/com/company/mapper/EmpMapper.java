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
}




