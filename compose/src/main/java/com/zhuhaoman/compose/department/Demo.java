package com.zhuhaoman.compose.department;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author zhuhaoman
 * @Date 2020/6/5 15:49
 **/
public class Demo {
    private static final long ORGANIZATION_ROOT_ID = 1001;

    public void buildOrganization() {
        Department department = new Department(ORGANIZATION_ROOT_ID);
        buildOrganization(department);
    }

    private void buildOrganization(Department department) {
        List<Long> subDepartmentIds = new ArrayList<>();
        for (Long subDepartmentId : subDepartmentIds) {
            Department subDepartment = new Department(subDepartmentId);
            department.addSubNode(subDepartment);
            buildOrganization(subDepartment);
        }

        List<Long> employmentIds = new ArrayList<>();
        for (Long employmentId : employmentIds) {
            double salary = 1.0;
            department.addSubNode(new Employee(employmentId, salary));
        }
    }
}
