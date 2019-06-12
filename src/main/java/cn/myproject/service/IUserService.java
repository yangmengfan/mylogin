package cn.myproject.service;

import cn.myproject.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
* <p>
*  服务类
* </p>
*
* @author yangmf
* @since 2019-06-12
*/

public interface IUserService extends IService<User> {

    public boolean save(User user);

    public boolean deleteById(String id);

    public boolean updateById(User user);

    public User selectById(String id);

    public IPage<User> queryPage(Page page, User User);

}

