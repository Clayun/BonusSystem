package com.github.mikesam.tools.controller;

import com.github.mikesam.tools.model.MUser;
import com.github.mikesam.tools.service.BsService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Mikesam on 2017/9/6.
 */
@Controller
@RequestMapping("/insert")
public class InsertController {

    @Autowired
    private BsService bsService;

    @RequestMapping("/insertUser")
    @ResponseBody
    public String insertUser(HttpServletRequest request, MUser mUser){
        return "";
    }

}
