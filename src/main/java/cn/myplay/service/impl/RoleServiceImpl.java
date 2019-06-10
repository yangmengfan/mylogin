package cn.myplay.service.impl;

import cn.myplay.entity.Role;
import cn.myplay.mapper.RoleMapper;
import cn.myplay.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
