package cn.myproject.controller;

import cn.myproject.common.ResultDto;
import cn.myproject.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cn.myproject.entity.User;
import org.springframework.stereotype.Controller;

/**
* <p>
*  前端控制器
* </p>
*
* @author yangmf
* @since 2019-06-12
*/

@Controller
@RequestMapping("user")
public class UserController  {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ResultDto save(User user){
        Boolean res = userService.save(user);
        return new ResultDto(res);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResultDto delete(@PathVariable("id")String id){
        Boolean res = userService.deleteById(id);
        return new ResultDto(res);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public ResultDto update(User user){
        Boolean res = userService.updateById(user);
        return new ResultDto(res);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultDto selectById(@PathVariable("id")String id){
        User user = userService.getById(id);
        return ResultDto.dataInstance(user);
    }
}
