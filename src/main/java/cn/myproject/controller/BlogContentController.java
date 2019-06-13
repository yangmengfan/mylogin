package cn.myproject.controller;

import cn.myproject.common.BaseController;
import cn.myproject.common.ResultDto;
import cn.myproject.service.IBlogContentService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cn.myproject.entity.BlogContent;
import org.springframework.stereotype.Controller;

/**
* <p>
* 文章内容 前端控制器
* </p>
*
* @author yangmf
* @since 2019-06-13
*/

@Controller
@RequestMapping("blogContent")
public class BlogContentController extends BaseController {
    @Autowired
    IBlogContentService blogContentService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ResultDto save(BlogContent blogContent){
        Boolean res = blogContentService.save(blogContent);
        return new ResultDto(res);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResultDto delete(@PathVariable("id")String id){
        Boolean res = blogContentService.deleteById(id);
        return new ResultDto(res);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public ResultDto update(BlogContent blogContent){
        Boolean res = blogContentService.updateById(blogContent);
        return new ResultDto(res);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultDto selectById(@PathVariable("id")String id){
        BlogContent blogContent = blogContentService.getById(id);
        return ResultDto.dataInstance(blogContent);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public ResultDto queryPage(BlogContent blogContent){
        IPage blogContentList = blogContentService.queryPage(getPage(),blogContent);
        return ResultDto.pageInstance(blogContentList);
    }
}
