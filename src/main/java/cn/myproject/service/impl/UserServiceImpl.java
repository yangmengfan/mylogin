package cn.myproject.service.impl;

import cn.myproject.entity.User;
import cn.myproject.mapper.UserMapper;
import cn.myproject.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
* <p>
*  服务实现类
* </p>
*
* @author yangmf
* @since 2019-06-12
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean save(User user){
        return this.save(user);
    }

    @Override
    public boolean deleteById(String id){
        if(StringUtils.isEmpty(id)){
            return false;
        }
        return this.removeById(id);
    }

    @Override
    public boolean updateById(User user){
        return this.updateById(user);
    }

    @Override
    public User selectById(String id){
        if(StringUtils.isEmpty(id)){
            return null;
        }
        return this.getById(id);
    }

    @Override
    public IPage<User> queryPage(Page page, User user){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        return this.page(page, queryWrapper);
    }
}

