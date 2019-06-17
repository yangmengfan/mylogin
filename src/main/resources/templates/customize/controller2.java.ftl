package ${package.Controller};

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import cn.myproject.common.ResultDto;
import org.springframework.web.bind.annotation.*;
import ${package.Entity}.${entity};
import cn.myproject.service.I${entity}Service;
import org.springframework.stereotype.Controller;
<#if superControllerClassPackage??>
import ${superControllerClassPackage};
import cn.myproject.common.BaseController;

</#if>

/**
* <p>
* ${table.comment!} 前端控制器
* </p>
*
* @author ${author}
* @since ${date}
*/

@Controller
@RequestMapping("${entity? uncap_first}")
public class ${table.controllerName}  extends BaseController{
    @Autowired
    I${entity}Service ${entity? uncap_first}Service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ResultDto save(${entity} ${entity? uncap_first}){
        Boolean res = ${entity? uncap_first}Service.save(${entity? uncap_first});
        return new ResultDto(res);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResultDto delete(@PathVariable("id")String id){
        Boolean res = ${entity? uncap_first}Service.deleteById(id);
        return new ResultDto(res);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public ResultDto update(${entity} ${entity? uncap_first}){
        Boolean res = ${entity? uncap_first}Service.updateById(${entity? uncap_first});
        return new ResultDto(res);
    }

    @RequestMapping(value = "/data/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultDto selectById(@PathVariable("id")String id){
        ${entity} ${entity? uncap_first} = ${entity? uncap_first}Service.getById(id);
        return ResultDto.dataInstance(${entity? uncap_first});
    }

    @RequestMapping(value = "/listData", method = RequestMethod.GET)
    @ResponseBody
    public ResultDto queryPage(${entity} ${entity? uncap_first}){
        IPage ${entity? uncap_first}List = ${entity? uncap_first}Service.queryPage(null,null);
        return ResultDto.pageInstance(${entity? uncap_first}List);
    }
}
