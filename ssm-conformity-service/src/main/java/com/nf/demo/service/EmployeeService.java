package com.nf.demo.service;

import com.nf.demo.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAll(int pageNum, int pageSize);
}
