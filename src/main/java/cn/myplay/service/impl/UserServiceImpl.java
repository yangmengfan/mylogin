package cn.myplay.service.impl;

import cn.myplay.entity.User;
import cn.myplay.mapper.UserMapper;
import cn.myplay.service.IUserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yangmf
 * @since 2019-06-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User findByName(String id) {
        if(StringUtils.isEmpty(id)){
            return null;
        }

        return this.getById(id);
    }

}
