package com.stackroute.exercise2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller                             //Controller which handles the requests
public class UserController {
    @RequestMapping(value="login")      //Maps the requests matching login
    public ModelAndView print(@ModelAttribute("user") User user, Model model)
    {

    ModelAndView modelAndView=new ModelAndView();
    model.addAttribute("user",user);
        modelAndView.setViewName("display");        //sets the view name
    return modelAndView;
    }
}
