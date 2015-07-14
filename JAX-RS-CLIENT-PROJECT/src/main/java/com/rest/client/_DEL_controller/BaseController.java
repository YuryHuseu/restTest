package com.rest.client._DEL_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ygusev on 29.06.2015.
 */
@Controller
@RequestMapping("/")
public class BaseController {

    @RequestMapping()
    public String index() {
        return "index";
    }
}
