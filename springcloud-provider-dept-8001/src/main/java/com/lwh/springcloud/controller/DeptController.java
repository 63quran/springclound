package com.lwh.springcloud.controller;

import com.lwh.springcloud.pojo.Dept;
import com.lwh.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class DeptController {

    @Autowired
    IDeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/queryOne")
    public Dept queryById(Long id){
        return deptService.queryDeptById(id);
    }

    @GetMapping("/dept/queryList")
    public List<Dept> queryDeptList(){
        return deptService.queryAll();
    }
}
