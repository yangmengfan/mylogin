package cn.myplay.controller;


import cn.myplay.common.ResultDto;
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
@RequestMapping("/role")
public class RoleController {

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultDto getMessage() {
        return ResultDto.success("您拥有用户权限，可以获得该接口的信息！");
    }
}
