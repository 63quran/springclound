package com.lwh.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)//开启后 支持链式写法
public class Dept implements Serializable {

    private Long deptno;

    private String deptname;

    //这个字段存放 数据库名，微服务~一个服务对应一个数据库，同一个新消息可能存在不同的数据库，所以用这个字段标识是存在哪个数据库
    private String db_source;


    public Dept(String deptname) {
        this.deptname = deptname;
    }
    /*
    链式写法：
    Dept dept = new Dept();

    dept.setDeptNo(11).setDname('xxxx')
    即可以设置多个字段数据
     */
}
