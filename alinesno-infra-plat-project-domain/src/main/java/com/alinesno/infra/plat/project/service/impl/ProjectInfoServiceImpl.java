package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.ProjectInfoEntity;
import com.alinesno.infra.plat.project.mapper.ProjectInfoMapper;
import com.alinesno.infra.plat.project.service.ProjectInfoService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectInfoServiceImpl extends IBaseServiceImpl<ProjectInfoEntity, ProjectInfoMapper> implements ProjectInfoService {
    // 可以添加一些特殊的服务实现
    @Autowired
    private ProjectInfoMapper projectInfoMapper;

    @Override
    public Page<ProjectInfoEntity> getProjects(int page, int limit) {
        // 使用Mybatis-plus的分页插件进行分页查询
        Page<ProjectInfoEntity> pageParam = new Page<>(page, limit);
        return projectInfoMapper.selectPage(pageParam, null);
    }

    @Override
    public ProjectInfoEntity createProject(ProjectInfoEntity projectInfoEntity) {
        projectInfoMapper.insert(projectInfoEntity);
        return projectInfoEntity;
    }

    @Override
    public ProjectInfoEntity getProjectById(Long id) {
        return projectInfoMapper.selectById(id);
    }

    @Override
    public ProjectInfoEntity updateProject(Long id, ProjectInfoEntity projectInfoEntity) {
        projectInfoEntity.setId(id);
        projectInfoMapper.updateById(projectInfoEntity);
        return projectInfoEntity;
    }

    @Override
    public void deleteProject(Long id) {
        projectInfoMapper.deleteById(id);
    }
}
