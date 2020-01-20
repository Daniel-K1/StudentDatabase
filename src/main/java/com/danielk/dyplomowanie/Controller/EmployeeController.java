package com.danielk.dyplomowanie.Controller;

import com.danielk.dyplomowanie.Employee;
import com.danielk.dyplomowanie.Repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor

public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @GetMapping("/showemployeethesis/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid com.danielk.dyplomowanie.Student Id:" + id));

        model.addAttribute("employee", employee);
        return "show-employee-thesis";
    }
}
