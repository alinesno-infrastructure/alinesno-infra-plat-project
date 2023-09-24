package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.PlanCaseEntity;
import com.alinesno.infra.plat.project.mapper.PlanCaseMapper;
import com.alinesno.infra.plat.project.service.PlanCaseService;
import org.springframework.stereotype.Service;

@Service
public class PlanCaseServiceImpl extends IBaseServiceImpl<PlanCaseEntity, PlanCaseMapper> implements PlanCaseService {
    // 可以添加一些特殊的服务实现
}
