package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.CompanyEntity;
import com.alinesno.infra.plat.project.mapper.CompanyMapper;
import com.alinesno.infra.plat.project.service.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl extends IBaseServiceImpl<CompanyEntity, CompanyMapper> implements CompanyService {
    // 可以添加一些特殊的服务实现
}
