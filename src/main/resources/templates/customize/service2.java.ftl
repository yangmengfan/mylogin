package ${package.Service};

import ${package.Entity}.${entity};
import ${superServiceClassPackage};
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
* <p>
* ${table.comment!} 服务类
* </p>
*
* @author ${author}
* @since ${date}
*/

public interface ${table.serviceName} extends ${superServiceClass}<${entity}> {

    public boolean save(${entity} ${entity? uncap_first});

    public boolean deleteById(String id);

    public boolean updateById(${entity} ${entity? uncap_first});

    public ${entity} getById(String id);

    public IPage<${entity}> queryPage(Page page, ${entity} ${entity? cap_first});

}

