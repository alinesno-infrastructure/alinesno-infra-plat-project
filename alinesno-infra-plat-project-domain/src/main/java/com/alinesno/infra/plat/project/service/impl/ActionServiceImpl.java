package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.ActionEntity;
import com.alinesno.infra.plat.project.mapper.ActionMapper;
import com.alinesno.infra.plat.project.service.ActionService;
import org.springframework.stereotype.Service;

@Service
public class ActionServiceImpl extends IBaseServiceImpl<ActionEntity, ActionMapper> implements ActionService {
}
