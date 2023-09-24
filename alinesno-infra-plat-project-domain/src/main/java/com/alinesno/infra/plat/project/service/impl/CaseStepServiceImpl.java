package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.CaseStepEntity;
import com.alinesno.infra.plat.project.mapper.CaseStepMapper;
import com.alinesno.infra.plat.project.service.CaseStepService;
import org.springframework.stereotype.Service;

@Service
public class CaseStepServiceImpl extends IBaseServiceImpl<CaseStepEntity, CaseStepMapper> implements CaseStepService {
}
