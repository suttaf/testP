package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerTest {
	
	
	@RequestMapping("/homePage")
    public String message() {

        return "index";
    }

}
