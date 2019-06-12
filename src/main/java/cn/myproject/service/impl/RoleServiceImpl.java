package cn.myproject.service.impl;

import cn.myproject.entity.Role;
import cn.myproject.mapper.RoleMapper;
import cn.myproject.service.IRoleService;
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
* @since 2019-06-11
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public boolean save(Role role){
        return this.save(role);
    }

    @Override
    public boolean deleteById(String id){
        if(StringUtils.isEmpty(id)){
            return false;
        }
        return this.removeById(id);
    }

    @Override
    public boolean updateById(Role role){
        return this.updateById(role);
    }

    @Override
    public Role selectById(String id){
        if(StringUtils.isEmpty(id)){
            return null;
        }
        return this.getById(id);
    }

    @Override
    public IPage<Role> queryPage(Page page, Role role){
        QueryWrapper<Role> queryWrapper = new QueryWrapper<>();

        return this.page(page, queryWrapper);
    }
}

