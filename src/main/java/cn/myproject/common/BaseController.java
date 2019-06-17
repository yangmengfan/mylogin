package cn.myproject.common;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: ymfa
 * @Date: 2019/6/10 17:35
 * @Description:
 */
public class BaseController {

    @Autowired
    private HttpServletRequest request;


    public Page getPage(){
        Page page = new Page();
        if(request.getParameter("pageNumber")!=null){
            page.setCurrent(Long.parseLong(request.getParameter("pageNumber")) );
        }else{
            page.setCurrent(0);
        }

        if(request.getParameter("pageSize")!=null){
            page.setSize(Long.parseLong(request.getParameter("pageSize")));
        }else{
            page.setSize(20);
        }

        return page;
    }
}
