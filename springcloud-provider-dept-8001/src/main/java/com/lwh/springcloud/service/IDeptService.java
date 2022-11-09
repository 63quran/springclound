package com.lwh.springcloud.service;

import com.lwh.springcloud.pojo.Dept;

import java.util.List;

public interface IDeptService {

    boolean addDept(Dept dept);

    Dept queryDeptById(Long id);

    List<Dept> queryAll();
}
