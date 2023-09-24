package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.DocEntity;
import com.alinesno.infra.plat.project.mapper.DocMapper;
import com.alinesno.infra.plat.project.service.DocService;
import org.springframework.stereotype.Service;

@Service
public class DocServiceImpl extends IBaseServiceImpl<DocEntity, DocMapper> implements DocService {
}
