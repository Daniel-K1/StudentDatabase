package com.danielk.dyplomowanie.Controller;

import com.danielk.dyplomowanie.Keyword;
import com.danielk.dyplomowanie.Repository.KeywordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor

public class KeywordController {

    private final KeywordRepository keywordRepository;

    @GetMapping("/showthesiswithkeyword/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Keyword keyword = keywordRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid com.danielk.dyplomowanie.Student Id:" + id));

        model.addAttribute("keyword", keyword);
        return "show-thesis-with-keyword";
    }
}
