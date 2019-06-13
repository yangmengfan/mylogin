package cn.myproject.service.impl;

import cn.myproject.entity.BlogContent;
import cn.myproject.mapper.BlogContentMapper;
import cn.myproject.service.IBlogContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
* <p>
* 文章内容 服务实现类
* </p>
*
* @author yangmf
* @since 2019-06-13
*/
@Service
public class BlogContentServiceImpl extends ServiceImpl<BlogContentMapper, BlogContent> implements IBlogContentService {
    @Autowired
    BlogContentMapper blogContentMapper;

    @Override
    public boolean save(BlogContent blogContent){
        return this.save(blogContent);
    }

    @Override
    public boolean deleteById(String id){
        if(StringUtils.isEmpty(id)){
            return false;
        }
        return this.removeById(id);
    }

    @Override
    public boolean updateById(BlogContent blogContent){
        return this.updateById(blogContent);
    }

    @Override
    public BlogContent selectById(String id){
        if(StringUtils.isEmpty(id)){
            return null;
        }
        return this.getById(id);
    }

    @Override
    public IPage<BlogContent> queryPage(Page page, BlogContent blogContent){
        QueryWrapper<BlogContent> queryWrapper = new QueryWrapper<>();
        return this.page(page, queryWrapper);
    }
}

