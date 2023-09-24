package com.alinesno.infra.plat.project.service;

import com.alinesno.infra.common.facade.services.IBaseService;
import com.alinesno.infra.plat.project.api.dto.BugDTO;
import com.alinesno.infra.plat.project.entity.BugEntity;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * ProjectBugService接口定义了对ProjectBugEntity实体的服务操作。
 * 这个接口继承自IBaseService接口，提供了对ProjectBugEntity实体的基本CRUD操作。
 */
public interface BugService extends IBaseService<BugEntity> {
    Page<BugDTO> getBugsByProductId(Long productId, Integer page, Integer limit);
    BugDTO createBug(Long productId, BugDTO bugDTO);
    BugDTO getBugById(Long bugId);
    BugDTO updateBug(Long bugId, BugDTO bugDTO);
    void deleteBug(Long bugId);
}
