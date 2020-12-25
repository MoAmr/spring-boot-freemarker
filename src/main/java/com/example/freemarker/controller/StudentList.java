package com.example.freemarker.controller;

import com.example.freemarker.model.Student;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohammed Amr
 * @created 26/12/2020 - 00:42
 * @project freemarker
 */

@RestController
public class StudentList {

    @RequestMapping("/list")
    public String list(Model model) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Tom", 80.5));
        list.add(new Student(2, "Jerry", 90.4));
        list.add(new Student(3, "Paul", 77.5));
        model.addAttribute("list", list);
        return "list";
    }
}
