package com.nf.demo.service.impl;

import com.nf.demo.dao.EmployeeDao;
import com.nf.demo.entity.EmployeeEntity;
import com.nf.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//fsdafsd
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<EmployeeEntity> getAll(int pageNum, int pageSize) {
        return employeeDao.getAll(pageNum,pageSize);
    }
}
