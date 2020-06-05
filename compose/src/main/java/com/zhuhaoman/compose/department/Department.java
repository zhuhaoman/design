package com.zhuhaoman.compose.department;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Department
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/6/5 15:43
 **/
public class Department extends HumanResource {
    private List<HumanResource> subNodes = new ArrayList<>();

    public Department(long id) {
        super(id);
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0;

        for (HumanResource human : subNodes) {
            totalSalary += human.calculateSalary();
        }

        this.salary = totalSalary;
        return totalSalary;
    }

    public void addSubNode(HumanResource humanResource) {
        subNodes.add(humanResource);
    }
}
