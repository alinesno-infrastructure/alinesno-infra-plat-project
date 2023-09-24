package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.EffortEntity;
import com.alinesno.infra.plat.project.mapper.EffortMapper;
import com.alinesno.infra.plat.project.service.EffortService;
import org.springframework.stereotype.Service;

@Service
public class EffortServiceImpl extends IBaseServiceImpl<EffortEntity, EffortMapper> implements EffortService {
}
