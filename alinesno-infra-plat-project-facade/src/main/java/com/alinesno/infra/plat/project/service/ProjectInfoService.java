package com.alinesno.infra.plat.project.service;

import com.alinesno.infra.common.facade.services.IBaseService;
import com.alinesno.infra.plat.project.entity.ProjectInfoEntity;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface ProjectInfoService extends IBaseService<ProjectInfoEntity> {
    // 获取项目列表
    Page<ProjectInfoEntity> getProjects(int page, int limit);

    // 创建项目
    ProjectInfoEntity createProject(ProjectInfoEntity projectInfoEntity);

    // 获取项目详情
    ProjectInfoEntity getProjectById(Long id);

    // 修改项目
    ProjectInfoEntity updateProject(Long id, ProjectInfoEntity projectInfoEntity);

    // 删除项目
    void deleteProject(Long id);
}
