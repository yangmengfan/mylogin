package cn.myplay.service.impl;

import cn.myplay.entity.User;
import cn.myplay.mapper.UserMapper;
import cn.myplay.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public User findByName(String name) {

        return userMapper.selectById(name);
    }
}
