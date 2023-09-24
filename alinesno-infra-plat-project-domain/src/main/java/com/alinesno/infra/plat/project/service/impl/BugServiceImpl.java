package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.BugEntity;
import com.alinesno.infra.plat.project.mapper.BugMapper;
import com.alinesno.infra.plat.project.service.BugService;
import org.springframework.stereotype.Service;

@Service
public class BugServiceImpl extends IBaseServiceImpl<BugEntity, BugMapper> implements BugService {
}
