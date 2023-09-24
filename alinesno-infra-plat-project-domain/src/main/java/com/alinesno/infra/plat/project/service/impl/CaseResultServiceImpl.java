package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.CaseResultEntity;
import com.alinesno.infra.plat.project.mapper.CaseResultMapper;
import com.alinesno.infra.plat.project.service.CaseResultService;
import org.springframework.stereotype.Service;

@Service
public class CaseResultServiceImpl extends IBaseServiceImpl<CaseResultEntity, CaseResultMapper> implements CaseResultService {
}
