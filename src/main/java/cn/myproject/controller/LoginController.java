package cn.myproject.controller;

import cn.myproject.common.ResultDto;
import cn.myproject.entity.User;
import cn.myproject.mapper.UserMapper;
import cn.myproject.util.RedisUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @Auther: ymfa
 * @Date: 2019/5/29 15:15
 * @Description:
 */
@Controller
@RequestMapping("/")
public class LoginController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    RedisUtil redisUtil;
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
    @RequestMapping("/loginpage")
    public String tologin(){
        return "login";
    }

    /**
     * 登陆
     *
     * @param username 用户名
     * @param password 密码
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResultDto login(HttpServletResponse response,String username, String password) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            return ResultDto.error("用户名或密码错误");
        }
        //根据权限，指定返回数据
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",username);
        String role = userMapper.selectOne(queryWrapper).getRole();
        if ("user".equals(role)) {
            //构建用户session
            String sessionId = UUID.randomUUID().toString();
            redisUtil.set(sessionId,token);
            response.addCookie(new Cookie("token",sessionId));
            return ResultDto.success("欢迎登陆");
        }
        if ("admin".equals(role)) {
            return ResultDto.success("欢迎来到管理员页面");
        }
        return ResultDto.error("权限错误！");
    }
}
