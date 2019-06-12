package cn.myproject.service;

import cn.myproject.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
* <p>
*  服务类
* </p>
*
* @author yangmf
* @since 2019-06-11
*/

public interface IRoleService extends IService<Role> {

    public boolean save(Role role);

    public boolean deleteById(String id);

    public boolean updateById(Role role);

    public Role selectById(String id);

    public IPage<Role> queryPage(Page page, Role Role);

}

