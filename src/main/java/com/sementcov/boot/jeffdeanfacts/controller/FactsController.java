package com.sementcov.boot.jeffdeanfacts.controller;

import com.sementcov.boot.jeffdeanfacts.service.FactsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class FactsController {

    private FactsService factsService;

    public FactsController(FactsService factsService) {
        this.factsService = factsService;
    }

    @GetMapping
    public ModelAndView getRandomFact() {
        Map<String, String> map = new HashMap<>();
        map.put("message", factsService.getRandomFact());
        return new ModelAndView("fact", map);
    }
}
