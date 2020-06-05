package com.zhuhaoman.compose.department;

/**
 * @ClassName Employee
 * @Description 雇员
 * @Author zhuhaoman
 * @Date 2020/6/5 15:36
 **/
public class Employee extends HumanResource {
    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
