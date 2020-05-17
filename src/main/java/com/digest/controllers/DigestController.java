package com.digest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DigestController {

    @GetMapping(value = "/", produces = "MediaType.TEXT_HTML_VALUE; charset=UTF-8")
    @ResponseBody
    public String startDigestMainPage(Model model) {
        return "digestMainPage";
    }

    @GetMapping(value = "/addVacancy", produces = "MediaType.TEXT_HTML_VALUE; charset=UTF-8")
    @ResponseBody
    public String startAddVacancyPage() {
        return "addVacancyPage";
    }
}