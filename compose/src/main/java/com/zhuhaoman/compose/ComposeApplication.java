package com.zhuhaoman.compose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 使用 组合模式
 * 员工部门组织架构：部门下有员工，子部门；员工有薪资
 */
@SpringBootApplication
public class ComposeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComposeApplication.class, args);
    }

}
