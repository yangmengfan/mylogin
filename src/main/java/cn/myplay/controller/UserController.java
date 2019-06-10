package cn.myplay.controller;


import cn.myplay.common.ResultDto;
import cn.myplay.entity.User;
import cn.myplay.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
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

    /**
     * 登陆
     *
     * @param username 用户名
     * @param password 密码
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultDto login(String username, String password) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        subject.login(token);
        //根据权限，指定返回数据
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",username);
        String role = userMapper.selectOne(queryWrapper).getRole();
        if ("user".equals(role)) {
            return ResultDto.success("欢迎登陆");
        }
        if ("admin".equals(role)) {
            return ResultDto.success("欢迎来到管理员页面");
        }
        return ResultDto.success("权限错误！");
    }
}
