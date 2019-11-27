package com.nf.demo.dao;

import com.nf.demo.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

    List<EmployeeEntity> getAll(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);


}
