package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.UserGroupEntity;
import com.alinesno.infra.plat.project.mapper.UserGroupMapper;
import com.alinesno.infra.plat.project.service.UserGroupService;
import org.springframework.stereotype.Service;

@Service
public class UserGroupServiceImpl extends IBaseServiceImpl<UserGroupEntity, UserGroupMapper> implements UserGroupService {
    // 可以添加一些特殊的服务实现
}
