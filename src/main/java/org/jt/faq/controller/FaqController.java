package org.jt.faq.controller;

import org.jt.faq.model.Heading;
import org.jt.faq.service.FaqService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FaqController {
    // property based
    // private FaqService service = new FaqService();
    // @Autowired
    // private FaqService service;
    // private final FaqService service;

    // public FaqController(){
    // service = new FaqService();
    // }

    private final FaqService service;

    @GetMapping({ "/", "/home" })
    public String home(Model model) {
        String title = "FAQ'S";
        String subTitle = "Just the fact";

        var heading = Heading.builder()
                .title(title)
                .subTitle(subTitle)
                .build();

        model.addAttribute("heading", heading);

        var questions = service.getQuestions();
        model.addAttribute("questions", questions);

        return "home";
    }
}
