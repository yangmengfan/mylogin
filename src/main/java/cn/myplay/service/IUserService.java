package cn.myplay.service;

import cn.myplay.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yangmf
 * @since 2019-06-10
 */
public interface IUserService extends IService<User> {

    User findByName(String name);
}
