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
}




