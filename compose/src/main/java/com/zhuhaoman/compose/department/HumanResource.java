package com.zhuhaoman.compose.department;

/**
 * @ClassName HumanResource
 * @Description
 *
 *  使用 组合模式
 *  员工部门组织架构：部门下有员工，子部门；员工有薪资
 * @Author zhuhaoman
 * @Date 2020/6/5 15:31
 **/
public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
    //计算员工薪资
    public abstract double calculateSalary();
}
