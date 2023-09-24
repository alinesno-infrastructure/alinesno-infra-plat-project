package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.CaseEntity;
import com.alinesno.infra.plat.project.mapper.CaseMapper;
import com.alinesno.infra.plat.project.service.CaseService;
import org.springframework.stereotype.Service;

@Service
public class CaseServiceImpl extends IBaseServiceImpl<CaseEntity, CaseMapper> implements CaseService {
}
