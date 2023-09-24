package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.UserEntity;
import com.alinesno.infra.plat.project.mapper.UserMapper;
import com.alinesno.infra.plat.project.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends IBaseServiceImpl<UserEntity, UserMapper> implements UserService {
    // 可以添加一些特殊的服务实现
}
