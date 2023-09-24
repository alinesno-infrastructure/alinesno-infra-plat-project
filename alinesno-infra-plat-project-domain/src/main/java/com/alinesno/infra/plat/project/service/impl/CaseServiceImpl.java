package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.api.dto.CaseDto;
import com.alinesno.infra.plat.project.api.dto.CaseStepDto;
import com.alinesno.infra.plat.project.entity.CaseEntity;
import com.alinesno.infra.plat.project.entity.CaseStepEntity;
import com.alinesno.infra.plat.project.mapper.CaseMapper;
import com.alinesno.infra.plat.project.mapper.CaseStepMapper;
import com.alinesno.infra.plat.project.service.CaseService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CaseServiceImpl extends IBaseServiceImpl<CaseEntity, CaseMapper> implements CaseService {

    @Autowired
    private CaseStepMapper caseStepMapper;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CaseDto> getCaseListByProductId(Long productId) {
        List<CaseEntity> caseEntities = lambdaQuery().eq(CaseEntity::getProduct, productId).list();
        return caseEntities.stream().map(caseEntity -> {
            CaseDto caseDto = modelMapper.map(caseEntity, CaseDto.class);
            List<CaseStepEntity> stepEntities = caseStepMapper.selectList(new QueryWrapper<CaseStepEntity>().eq("case_id", caseEntity.getId()));
            caseDto.setSteps(stepEntities.stream().map(stepEntity -> modelMapper.map(stepEntity, CaseStepDto.class)).collect(Collectors.toList()));
            return caseDto;
        }).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public CaseDto createCase(Long productId, CaseDto caseDto) {
        CaseEntity caseEntity = modelMapper.map(caseDto, CaseEntity.class);
        caseEntity.setProduct(productId);
        save(caseEntity);
        caseDto.getSteps().forEach(stepDto -> {
            CaseStepEntity stepEntity = modelMapper.map(stepDto, CaseStepEntity.class);
            stepEntity.setCaseId(caseEntity.getId());
            caseStepMapper.insert(stepEntity);
        });
        return caseDto;
    }

    @Override
    public CaseDto getCaseById(Long caseId) {
        CaseEntity caseEntity = getById(caseId);
        CaseDto caseDto = modelMapper.map(caseEntity, CaseDto.class);
        List<CaseStepEntity> stepEntities = caseStepMapper.selectList(new QueryWrapper<CaseStepEntity>().eq("case_id", caseId));
        caseDto.setSteps(stepEntities.stream().map(stepEntity -> modelMapper.map(stepEntity, CaseStepDto.class)).collect(Collectors.toList()));
        return caseDto;
    }

    @Transactional
    @Override
    public CaseDto updateCase(Long caseId, CaseDto caseDto) {
        CaseEntity caseEntity = modelMapper.map(caseDto, CaseEntity.class);
        caseEntity.setId(caseId);
        updateById(caseEntity);
        caseStepMapper.delete(new QueryWrapper<CaseStepEntity>().eq("case_id", caseId));
        caseDto.getSteps().forEach(stepDto -> {
            CaseStepEntity stepEntity = modelMapper.map(stepDto, CaseStepEntity.class);
            stepEntity.setCaseId(caseId);
            caseStepMapper.insert(stepEntity);
        });
        return caseDto;
    }

    @Transactional
    @Override
    public void deleteCase(Integer caseId) {
        removeById(caseId);
        caseStepMapper.delete(new QueryWrapper<CaseStepEntity>().eq("case_id", caseId));
    }
}

