package ${package.ServiceImpl};

import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${package.Service}.${table.serviceName};
import ${superServiceImplClassPackage};
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/**
* <p>
* ${table.comment!} 服务实现类
* </p>
*
* @author ${author}
* @since ${date}
*/
@Service
public class ${table.serviceImplName} extends ${superServiceImplClass}<${table.mapperName}, ${entity}> implements ${table.serviceName} {
    @Autowired
    ${table.mapperName} ${table.mapperName? uncap_first};

    @Override
    public boolean save(${entity} ${entity? uncap_first}){
        return this.save(${entity? uncap_first});
    }

    @Override
    public boolean deleteById(String id){
        if(StringUtils.isEmpty(id)){
            return false;
        }
        return this.removeById(id);
    }

    @Override
    public boolean updateById(${entity} ${entity? uncap_first}){
        return this.updateById(${entity? uncap_first});
    }

    @Override
    public ${entity} getById(String id){
        if(StringUtils.isEmpty(id)){
            return null;
        }
        return this.getById(id);
    }

    @Override
    public IPage<${entity}> queryPage(Page page, ${entity} ${entity? uncap_first}){
        QueryWrapper<${entity}> queryWrapper = new QueryWrapper<>();

        return this.page(page, queryWrapper);
    }
}

