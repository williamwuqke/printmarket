package com.printmarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wuqiongke on 15/11/7.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public ModelAndView toHome(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("param","hello");
        mv.addObject("name","wuqke");
        return mv;

    }

    @RequestMapping("/string")
    public String testString(HttpServletRequest request, HttpServletResponse response){
        return "StringIsOkay";

    }

    @RequestMapping("home.do")
    public ModelAndView testDo(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("index");
        return mv;

    }
}
