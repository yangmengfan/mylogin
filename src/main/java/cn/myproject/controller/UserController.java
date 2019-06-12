package cn.myproject.controller;


import cn.myproject.common.ResultDto;
import cn.myproject.mapper.UserMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yangmf
 * @since 2019-06-10
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public ResultDto login() {
        return ResultDto.success("欢迎进入，您的身份是游客");
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultDto submitLogin() {
        return ResultDto.success("您拥有获得该接口的信息的权限！");
    }

    private UserMapper userMapper;

    @RequestMapping(value = "/notLogin", method = RequestMethod.GET)
    public ResultDto notLogin() {
        return ResultDto.success("您尚未登陆！");
    }

    @RequestMapping(value = "/notRole", method = RequestMethod.GET)
    public ResultDto notRole() {
        return ResultDto.success("您没有权限！");
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ResultDto logout() {
        Subject subject = SecurityUtils.getSubject();
        //注销
        subject.logout();
        return ResultDto.success("成功注销！");
    }

}
