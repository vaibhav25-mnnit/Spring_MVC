package com.vaibhav.springmvc.controller;

import com.vaibhav.springmvc.modal.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FormController {

    @Value("${lang}")
    List<String> lang;

    @Value("${avlSystems}")
    List<String> avlSystems;

    @GetMapping("/fill-details")
    public String showStudentForm(Model theModel){
        Student theStudent = new Student();
        theModel.addAttribute("student",theStudent);
        theModel.addAttribute("lang",lang);
        theModel.addAttribute("avlSystems",avlSystems);
        return "Form";
    }

    @PostMapping("/show-details")
    public String showStudentDetails(@ModelAttribute("student") Student theStudent){
        System.out.println(theStudent.toString());
        return "FormResponse";
    }
}
