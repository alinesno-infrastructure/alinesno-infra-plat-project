package com.alinesno.infra.plat.project.mapper;

import com.alinesno.infra.common.facade.mapper.repository.IBaseMapper;
import com.alinesno.infra.plat.project.entity.BugEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ProjectBugMapper接口定义了对ProjectBugEntity实体的数据库操作。
 * 这个接口继承自IBaseMapper接口，提供了对ProjectBugEntity实体的基本数据库CRUD操作。
 */
public interface BugMapper extends IBaseMapper<BugEntity> {

    @Select("SELECT * FROM bugs WHERE product_id = #{productId} LIMIT #{limit} OFFSET #{offset}")
    List<BugEntity> getBugsByProductId(@Param("productId") Long productId, @Param("limit") Integer limit, @Param("offset") Integer offset);

}
