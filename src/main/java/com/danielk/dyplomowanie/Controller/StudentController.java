package com.danielk.dyplomowanie.Controller;

import com.danielk.dyplomowanie.Student;
import com.danielk.dyplomowanie.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;

    @GetMapping("/showthesis/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid com.danielk.dyplomowanie.Student Id:" + id));

        model.addAttribute("student", student);
        return "show-student-thesis";
    }

    @GetMapping("/")
    public String showStudents(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }
}