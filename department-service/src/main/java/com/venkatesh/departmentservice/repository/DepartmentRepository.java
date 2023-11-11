package com.venkatesh.departmentservice.repository;

import com.venkatesh.departmentservice.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository  {

    private List<Department> departments=new ArrayList<>();

    public Department addDepartment(Department department){
        departments.add(department);
        return department;
    }
//    public Department findById(Long id) {
//        return departments.stream()
//                .filter(department ->
//                        department.getId())
//                .findFirst()
//                .orElseThrow();
//    }
    public List<Department> findAll(){
        return departments;
    }
}
