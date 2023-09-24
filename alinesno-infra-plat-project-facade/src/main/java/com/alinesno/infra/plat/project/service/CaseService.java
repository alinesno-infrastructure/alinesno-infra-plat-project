package com.alinesno.infra.plat.project.service;

import com.alinesno.infra.common.facade.services.IBaseService;
import com.alinesno.infra.plat.project.api.dto.CaseDto;
import com.alinesno.infra.plat.project.entity.CaseEntity;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;

/**
 * ProjectCaseService接口定义了对ProjectCaseEntity实体的服务操作。
 * 这个接口继承自IBaseService接口，提供了对ProjectCaseEntity实体的基本CRUD操作。
 */
public interface CaseService extends IBaseService<CaseEntity> {

    List<CaseDto> getCaseListByProductId(Long productId);
    CaseDto createCase(Long productId, CaseDto caseDto);
    CaseDto getCaseById(Long caseId);
    CaseDto updateCase(Long caseId, CaseDto caseDto);
    void deleteCase(Integer caseId);
}
