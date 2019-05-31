package cn.myplay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: ymfa
 * @Date: 2019/5/29 15:15
 * @Description:
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
}
