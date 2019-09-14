package com.simplemvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") String t1, @RequestParam("t1") String t2 ) {
        int i=Integer.parseInt(t1);
        int j=Integer.parseInt(t2);
        int k=i+j;
        ModelAndView mv=new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",k);
        return mv;
    }

}
