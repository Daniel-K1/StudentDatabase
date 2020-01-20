package com.danielk.dyplomowanie.Controller;

import com.danielk.dyplomowanie.Thesis;
import com.danielk.dyplomowanie.Repository.ThesisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor

public class ThesisController {

    private final ThesisRepository thesisRepository;

    @GetMapping("/showthesisdetails/{id}")
    public String showThesis(@PathVariable("id") long id, Model model) {
        Thesis thesis = thesisRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid com.danielk.dyplomowanie.Thesis Id:" + id));
        model.addAttribute("thesis", thesis);
        return "show-thesis-details";
    }
}
