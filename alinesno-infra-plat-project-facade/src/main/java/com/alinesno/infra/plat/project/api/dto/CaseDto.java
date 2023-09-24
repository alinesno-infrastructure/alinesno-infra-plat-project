package com.alinesno.infra.plat.project.api.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class CaseDto {
    private Integer id;
    private Integer product;
    private Integer branch;
    private Integer module;
    private Integer story;
    private Integer storyVersion;
    private String title;
    private String precondition;
    private String keywords;
    private Integer pri;
    private String type;
    private String stage;
    private String status;
    private String openedBy;
    private Date openedDate;
    private Integer fromBug;
    private Integer fromCaseID;
    private List<CaseStepDto> steps;
}
