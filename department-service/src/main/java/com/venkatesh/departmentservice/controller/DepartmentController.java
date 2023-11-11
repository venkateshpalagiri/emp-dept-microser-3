package com.venkatesh.departmentservice.controller;

import com.venkatesh.departmentservice.model.Department;
import com.venkatesh.departmentservice.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOGGER
            = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentRepository departmentRepository;
    @PostMapping
    public Department add(@RequestBody Department department){
        LOGGER.info("Department created: {}",department);
        return departmentRepository.addDepartment(department);
    }
//    @GetMapping
//    public List<Department> findAll(){
//        LOGGER.info("Department find all");
//        return departmentRepository.findAll();
//    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){
        LOGGER.info("Department find by: {}",id);
        return departmentRepository.findById(id);
    }
}
