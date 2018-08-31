package com.company.project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangzhifu on 2018/8/20.
 */
@Controller
public class AutoController {

    @RequestMapping("/demo")
    public String indexView() {
        return "me";
    }
}
