package com.nf.demo.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class EmployeeEntity {
    private Integer id;
    private String username;
    private BigDecimal salary;
    private Date hiredate;
}
