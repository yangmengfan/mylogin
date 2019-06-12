package cn.myproject.controller;

import cn.myproject.common.ResultDto;
import cn.myproject.service.IRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import cn.myproject.entity.Role;
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
@RequestMapping("role")
public class RoleController  {
    @Autowired
    IRoleService roleService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ResultDto save(Role role){
        Boolean res = roleService.save(role);
        return new ResultDto(res);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResultDto delete(@PathVariable("id")String id){
        Boolean res = roleService.deleteById(id);
        return new ResultDto(res);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public ResultDto update(Role role){
        Boolean res = roleService.updateById(role);
        return new ResultDto(res);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultDto selectById(@PathVariable("id")String id){
        Role role = roleService.getById(id);
        return ResultDto.dataInstance(role);
    }
}
