package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.ModuleEntity;
import com.alinesno.infra.plat.project.mapper.ModuleMapper;
import com.alinesno.infra.plat.project.service.ModuleService;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceImpl extends IBaseServiceImpl<ModuleEntity, ModuleMapper> implements ModuleService {
    // 可以添加一些特殊的服务实现
}
