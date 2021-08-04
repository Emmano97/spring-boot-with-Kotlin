package com.emmano.agorasinghor.control;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class MainController {

    @RequestMapping("/hello")
    fun hellloWorld(): ModelAndView = ModelAndView("helloWorld");
}
