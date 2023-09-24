package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.ProjectInfoEntity;
import com.alinesno.infra.plat.project.mapper.ProjectInfoMapper;
import com.alinesno.infra.plat.project.service.ProjectInfoService;
import org.springframework.stereotype.Service;

@Service
public class ProjectInfoServiceImpl extends IBaseServiceImpl<ProjectInfoEntity, ProjectInfoMapper> implements ProjectInfoService {
    // 可以添加一些特殊的服务实现
}
