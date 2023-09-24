package com.alinesno.infra.plat.project.api.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class BugDTO {
    private Long id;
    private Long product;
    private Long branch;
    private Long module;
    private Long project;
    private Long execution;
    private Boolean toTask;
    private Boolean toStory;
    private String title;
    private String keywords;
    private Integer severity;
    private Integer pri;
    private String type;
    private String os;
    private String browser;
    private String steps;
    private Long task;
    private Long story;
    private String openedBy;
    private LocalDateTime openedDate;
    private LocalDate deadline;
    private String assignedTo;
    private LocalDateTime assignedDate;
    private String resolvedBy;
    private LocalDateTime resolvedDate;
    private String resolvedBuild;
    private String closedBy;
    private LocalDateTime closedDate;
    private String status;
}
