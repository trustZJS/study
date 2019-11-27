package com.nf.demo.controller;

import com.github.pagehelper.PageInfo;
import com.nf.demo.entity.EmployeeEntity;
import com.nf.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/list")
    public String list(@RequestParam(value = "pageNum" ,required = false,defaultValue = "1") int pageNum,
                       @RequestParam(value = "pageSize",required = false,defaultValue = "2") int pageSize, Model model){

        System.out.println("=========");
        List<EmployeeEntity> result = employeeService.getAll(pageNum,pageSize);
        PageInfo pageInfo = new PageInfo(result);
        model.addAttribute("pageInfo",pageInfo);
        return "/employee/list";
    }
}
