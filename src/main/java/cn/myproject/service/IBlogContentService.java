package cn.myproject.service;

import cn.myproject.entity.BlogContent;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
* <p>
* 文章内容 服务类
* </p>
*
* @author yangmf
* @since 2019-06-13
*/

public interface IBlogContentService extends IService<BlogContent> {

    public boolean save(BlogContent blogContent);

    public boolean deleteById(String id);

    public boolean updateById(BlogContent blogContent);

    public BlogContent selectById(String id);

    public IPage<BlogContent> queryPage(Page page, BlogContent BlogContent);

}

