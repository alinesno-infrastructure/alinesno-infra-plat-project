SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 创建project_action表，用于记录操作日志
CREATE TABLE IF NOT EXISTS `project_action` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '操作日志ID',
  `company` BIGINT unsigned NOT NULL default '0' COMMENT '公司ID',
  `object_type` varchar(30) NOT NULL default '' COMMENT '对象类型',
  `object_id` BIGINT unsigned NOT NULL default '0' COMMENT '对象ID',
  `actor` varchar(30) NOT NULL default '' COMMENT '操作人',
  `action` varchar(30) NOT NULL default '' COMMENT '操作类型',
  `date` int(10) unsigned NOT NULL default '0' COMMENT '操作日期',
  `comment` text NOT NULL COMMENT '操作备注',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='操作日志表';

-- 创建project_bug表，用于记录缺陷信息
CREATE TABLE IF NOT EXISTS `project_bug` (
  `id` BIGINT NOT NULL auto_increment COMMENT '缺陷ID',
  `product` BIGINT unsigned NOT NULL default '0' COMMENT '产品ID',
  `module` BIGINT unsigned NOT NULL default '0' COMMENT '模块ID',
  `project` BIGINT unsigned NOT NULL default '0' COMMENT '项目ID',
  `story` BIGINT unsigned NOT NULL default '0',
  `task` BIGINT unsigned NOT NULL default '0',
  `title` varchar(150) NOT NULL default '' COMMENT '标题',
  `severity` tinyint(4) NOT NULL default '0' COMMENT '严重程度',
  `type` varchar(30) NOT NULL default '' COMMENT '类型',
  `os` varchar(30) NOT NULL default '' COMMENT '操作系统',
  `browser` varchar(30) NOT NULL default '' COMMENT '浏览器',
  `hardware` varchar(30) NOT NULL COMMENT '硬件',
  `found` varchar(30) NOT NULL default '' COMMENT '发现方式',
  `steps` text NOT NULL COMMENT '复现步骤',
  `status` enum('active','resolved','closed') NOT NULL default 'active' COMMENT '状态',
  `mailto` varchar(255) NOT NULL default '' COMMENT '邮件接收人',
  `opened_by` varchar(30) NOT NULL default '' COMMENT '创建人',
  `opened_date` datetime NOT NULL COMMENT '创建日期',
  `opened_build` varchar(30) NOT NULL default '' COMMENT '创建版本',
  `assigned_to` varchar(30) NOT NULL default '' COMMENT '指派给',
  `assigned_date` datetime NOT NULL COMMENT '指派日期',
  `resolved_by` varchar(30) NOT NULL default '' COMMENT '解决人',
  `resolution` varchar(30) NOT NULL default '' COMMENT '解决结果',
  `resolved_build` varchar(30) NOT NULL default '' COMMENT '解决版本',
  `resolved_date` datetime NOT NULL COMMENT '解决日期',
  `closed_by` varchar(30) NOT NULL default '' COMMENT '关闭人',
  `closed_date` datetime NOT NULL COMMENT '关闭日期',
  `last_edited_by` varchar(30) NOT NULL default '' COMMENT '最后编辑人',
  `last_edited_date` datetime NOT NULL COMMENT '最后编辑日期',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='缺陷表';

-- 创建project_case表，用于记录用例信息
CREATE TABLE IF NOT EXISTS `project_case` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '用例ID',
  `product` BIGINT unsigned NOT NULL default '0' COMMENT '产品ID',
  `module` BIGINT unsigned NOT NULL default '0' COMMENT '模块ID',
  `path` BIGINT unsigned NOT NULL default '0' COMMENT '路径',
  `story` BIGINT unsigned NOT NULL default '0' COMMENT '需求ID',
  `title` char(30) NOT NULL default '' COMMENT '标题',
  `pri` tinyint(3) unsigned NOT NULL default '0' COMMENT '优先级',
  `type` char(30) NOT NULL default '1' COMMENT '类型',
  `status` char(30) NOT NULL default '1' COMMENT '状态',
  `steps` text NOT NULL COMMENT '步骤',
  `frequency` enum('1','2','3') NOT NULL default '1' COMMENT '执行频率',
  `order` tinyint(30) unsigned NOT NULL default '0' COMMENT '排序',
  `opened_by` char(30) NOT NULL default '' COMMENT '创建人',
  `opened_date` datetime NOT NULL COMMENT '创建日期',
  `last_edited_by` char(30) NOT NULL default '' COMMENT '最后编辑人',
  `last_edited_date` datetime NOT NULL COMMENT '最后编辑日期',
  `field1` char(30) NOT NULL default '' COMMENT '自定义字段1',
  `field2` char(30) NOT NULL default '' COMMENT '自定义字段2',
  `field3` char(30) NOT NULL default '' COMMENT '自定义字段3',
  `version` tinyint(3) unsigned NOT NULL default '0' COMMENT '版本',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='用例表';

-- 创建project_case_result表，用于记录用例执行结果
CREATE TABLE IF NOT EXISTS `project_case_result` (
  `id` BIGINT NOT NULL default '0' COMMENT '结果ID',
  `plan` BIGINT unsigned NOT NULL default '0' COMMENT '计划ID',
  `build` BIGINT unsigned NOT NULL default '0' COMMENT '构建ID',
  `case` BIGINT unsigned NOT NULL default '0' COMMENT '用例ID',
  `result` enum('pass','fail','skip') NOT NULL default 'pass' COMMENT '结果状态',
  `status` enum('finished','blocked') NOT NULL default 'finished' COMMENT '执行状态',
  `executed_by` char(30) NOT NULL default '' COMMENT '执行人',
  `executed_date` int(30) unsigned NOT NULL default '0' COMMENT '执行日期',

  `steps` text NOT NULL COMMENT '执行步骤',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='用例结果表';

-- 创建project_case_step表，用于记录用例步骤
CREATE TABLE IF NOT EXISTS `project_case_step` (
  `case` BIGINT unsigned NOT NULL default '0' COMMENT '用例ID',
  `version` tinyint(3) unsigned NOT NULL default '0' COMMENT '版本',
  `desc` text NOT NULL COMMENT '描述',
  `expect` text NOT NULL COMMENT '预期结果',
  PRIMARY KEY  (`case`,`version`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='用例步骤表';

-- 创建project_doc表，用于记录文档信息
CREATE TABLE IF NOT EXISTS `project_doc` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '文档ID',
  `product` BIGINT unsigned NOT NULL default '0' COMMENT '产品ID',
  `module` BIGINT unsigned NOT NULL default '0' COMMENT '模块ID',
  `project` BIGINT unsigned NOT NULL default '0' COMMENT '项目ID',
  `lib` BIGINT unsigned NOT NULL default '0' COMMENT '文档库ID',
  `title` char(30) NOT NULL default '' COMMENT '标题',
  `type` char(30) NOT NULL default '' COMMENT '类型',
  `status` char(30) NOT NULL default '1' COMMENT '状态',
  `opened_by` char(30) NOT NULL default '' COMMENT '创建人',
  `opened_date` datetime NOT NULL COMMENT '创建日期',
  `last_edited_by` char(30) NOT NULL default '' COMMENT '最后编辑人',
  `last_edited_date` datetime NOT NULL COMMENT '最后编辑日期',
  `version` tinyint(3) unsigned NOT NULL default '0' COMMENT '版本',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='文档表';

-- 创建project_effort表，用于记录工作量信息
CREATE TABLE IF NOT EXISTS `project_effort` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '工作量ID',
  `account` char(30) NOT NULL default '' COMMENT '用户账户',
  `work` char(30) NOT NULL default '' COMMENT '工作内容',
  `date` date NOT NULL COMMENT '日期',
  `left` float NOT NULL COMMENT '剩余工作量',
  `consumed` float NOT NULL COMMENT '已消耗工作量',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='工作量表';

-- 创建project_company表，用于记录公司信息
CREATE TABLE IF NOT EXISTS `project_company` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '公司ID',
  `name` char(120) NOT NULL default '' COMMENT '公司名称',
  `phone` char(20) NOT NULL COMMENT '电话',
  `fax` char(20) NOT NULL default '' COMMENT '传真',
  `address` char(120) NOT NULL default '' COMMENT '地址',
  `zipcode` char(10) NOT NULL default '' COMMENT '邮编',
  `website` char(120) NOT NULL default '' COMMENT '网站',
  `backyard` char(120) NOT NULL default '' COMMENT '后院',
  `pms` char(120) NOT NULL default '' COMMENT '项目管理系统',
  `guest` enum('1','0') NOT NULL default '0' COMMENT '是否允许游客访问',
  `admins` char(255) NOT NULL COMMENT '管理员',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='公司表';

-- 创建project_module表，用于记录模块信息
CREATE TABLE IF NOT EXISTS `project_module` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '模块ID',
  `product` BIGINT unsigned NOT NULL default '0' COMMENT '产品ID',
  `name` char(30) NOT NULL default '' COMMENT '模块名称',
  `parent` BIGINT unsigned NOT NULL default '0' COMMENT '父模块ID',
  `path` char(255) NOT NULL default '' COMMENT '路径',
  `grade` tinyint(3) unsigned NOT NULL default '0' COMMENT '等级',
  `order` tinyint(3) unsigned NOT NULL default '0' COMMENT '排序',
  `view` char(30) NOT NULL default '' COMMENT '视图',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='模块表';

-- 创建project_plan_case表，用于记录计划用例信息
CREATE TABLE IF NOT EXISTS `project_plan_case` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT 'ID',
  `plan` BIGINT unsigned NOT NULL default '0' COMMENT '计划ID',
  `case` BIGINT unsigned NOT NULL default '0' COMMENT '用例ID',
  `case_version` tinyint(3) unsigned NOT NULL default '0' COMMENT '用例版本',
  `assigned_to` char(30) NOT NULL default '' COMMENT '指派给',
  `assigned_date` BIGINT unsigned NOT NULL default '0' COMMENT '指派日期',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='计划用例表';

-- 创建project_product表，用于记录产品信息
CREATE TABLE IF NOT EXISTS `project_product` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '产品ID',
  `company` BIGINT unsigned NOT NULL default '0' COMMENT '公司ID',
  `name` varchar(30) NOT NULL default '' COMMENT '产品名称',
  `code` varchar(10) NOT NULL default '' COMMENT '产品代码',
  `order` tinyint(3) unsigned NOT NULL default '0' COMMENT '排序',
  `status` varchar(30) NOT NULL default '' COMMENT '状态',
  `desc` text NOT NULL COMMENT '描述',
  PRIMARY KEY  (`id`),
  KEY `company` (`company`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='产品表';

-- DROP TABLE IF EXISTS `project_task`;
-- 创建名为`project_task`的表，如果已经存在则删除
CREATE TABLE IF NOT EXISTS `project_task` (
  `id` BIGINT(20) unsigned NOT NULL auto_increment COMMENT '任务ID',
  `project` BIGINT(20) unsigned NOT NULL default '0' COMMENT '项目ID',
  `module` BIGINT(20) unsigned NOT NULL default '0' COMMENT '模块ID',
  `story` BIGINT(20) unsigned NOT NULL default '0' COMMENT '故事ID',
  `story_version` smallint(6) NOT NULL default '1' COMMENT '故事版本',
  `from_bug` BIGINT(20) unsigned NOT NULL default '0' COMMENT '来源BugID',
  `name` varchar(255) NOT NULL COMMENT '任务名称',
  `type` varchar(20) NOT NULL COMMENT '任务类型',
  `pri` tinyint(3) unsigned NOT NULL default '0' COMMENT '优先级',
  `estimate` float unsigned NOT NULL COMMENT '预计',
  `consumed` float unsigned NOT NULL COMMENT '已消耗',
  `left` float unsigned NOT NULL COMMENT '剩余',
  `deadline` date NOT NULL COMMENT '截止日期',
  `status` enum('wait','doing','done','pause','cancel','closed') NOT NULL default 'wait' COMMENT '状态',
  `mailto` varchar(255) NOT NULL default '' COMMENT '邮件接收者',
  `desc` text NOT NULL COMMENT '任务描述',
  `opened_by` varchar(30) NOT NULL COMMENT '打开者',
  `opened_date` datetime NOT NULL COMMENT '打开日期',
  `assigned_to` varchar(30) NOT NULL COMMENT '分配者',
  `assigned_date` datetime NOT NULL COMMENT '分配日期',
  `est_started` date NOT NULL COMMENT '预计开始日期',
  `real_started` date NOT NULL COMMENT '实际开始日期',
  `finished_by` varchar(30) NOT NULL COMMENT '完成者',
  `finished_date` datetime NOT NULL COMMENT '完成日期',
  `canceled_by` varchar(30) NOT NULL COMMENT '取消者',
  `canceled_date` datetime NOT NULL COMMENT '取消日期',
  `closed_by` varchar(30) NOT NULL COMMENT '关闭者',
  `closed_date` datetime NOT NULL COMMENT '关闭日期',
  `closed_reason` varchar(30) NOT NULL COMMENT '关闭原因',
  `lastEdited_by` varchar(30) NOT NULL COMMENT '最后编辑者',
  `lastEdited_date` datetime NOT NULL COMMENT '最后编辑日期',
  `deleted` enum('0','1') NOT NULL default '0' COMMENT '是否删除',
   PRIMARY KEY (`id`),
  KEY `task` (`project`,`module`,`story`,`assignedTo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- project_story表存储故事信息
DROP TABLE IF EXISTS `project_story`;
CREATE TABLE IF NOT EXISTS `project_story` (
  `id` BIGINT(20) unsigned NOT NULL auto_increment COMMENT '故事ID',
  `product` BIGINT(20) unsigned NOT NULL default '0' COMMENT '产品ID',
  `branch` BIGINT(20) unsigned NOT NULL default '0' COMMENT '分支ID',
  `module` BIGINT(20) unsigned NOT NULL default '0' COMMENT '模块ID',
  `plan` text NOT NULL default '' COMMENT '计划',
  `source` varchar(20) NOT NULL COMMENT '来源',
  `fromBug` BIGINT(20) unsigned NOT NULL default '0' COMMENT '来源BugID',
  `title` varchar(255) NOT NULL COMMENT '标题',
  `keywords` varchar(255) NOT NULL COMMENT '关键词',
  `type` varchar(30) NOT NULL default '' COMMENT '类型',
  `pri` tinyint(3) unsigned NOT NULL default '3' COMMENT '优先级',
  `estimate` float unsigned NOT NULL COMMENT '预计',
  `status` enum('','changed','active','draft','closed') NOT NULL default '' COMMENT '状态',
  `stage` enum('','wait','planned','projected','developing','developed','testing','tested','verified','released') NOT NULL DEFAULT 'wait' COMMENT '阶段',
  `mailto` varchar(255) NOT NULL default '' COMMENT '邮件接收者',
  `opened_by` varchar(30) NOT NULL default '' COMMENT '打开者',
  `opened_date` datetime NOT NULL COMMENT '打开日期',
  `assigned_to` varchar(30) NOT NULL default '' COMMENT '分配给',
  `assigned_date` datetime NOT NULL COMMENT '分配日期',
  `last_edited_by` varchar(30) NOT NULL default '' COMMENT '最后编辑者',
  `last_edited_date` datetime NOT NULL COMMENT '最后编辑日期',
  `reviewed_by` varchar(255) NOT NULL COMMENT '审核者',
  `reviewed_date` date NOT NULL COMMENT '审核日期',
  `closed_by` varchar(30) NOT NULL default '' COMMENT '关闭者',
  `closed_date` datetime NOT NULL COMMENT '关闭日期',
  `closed_reason` varchar(30) NOT NULL COMMENT '关闭原因',
  `to_bug` BIGINT(20) NOT NULL COMMENT '转为Bug',
  `child_stories` varchar(255) NOT NULL COMMENT '子故事',
  `link_stories` varchar(255) NOT NULL COMMENT '关联故事',
  `duplicate_story` BIGINT(20) unsigned NOT NULL COMMENT '重复故事',
  `version` smallint(6) NOT NULL default '1' COMMENT '版本',
  `deleted` enum('0','1') NOT NULL default '0' COMMENT '是否删除',
  PRIMARY KEY  (`id`),
  KEY `story` (`product`,`module`,`status`,`assignedTo`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- `project_taskestimate` 表存储任务估计相关的数据
DROP TABLE IF EXISTS `project_taskestimate`;
CREATE TABLE IF NOT EXISTS `project_taskestimate` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '主键ID',
  `task_id` BIGINT unsigned NOT NULL default '0' COMMENT '任务ID',
  `date` date NOT NULL COMMENT '日期',
  `left` float unsigned NOT NULL default '0' COMMENT '剩余工作量',
  `consumed` float unsigned NOT NULL COMMENT '已消耗工作量',
  `account` char(30) NOT NULL default '' COMMENT '账户',
  `work` varchar(255) NOT NULL COMMENT '工作内容',
  PRIMARY KEY  (`id`),
  KEY `task` (`task_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='任务估计表';

-- `project_team` 表存储团队相关的数据
DROP TABLE IF EXISTS `project_team`;
CREATE TABLE IF NOT EXISTS `project_team` (
  `project_id` BIGINT unsigned NOT NULL default '0' COMMENT '项目ID',
  `account` char(30) NOT NULL default '' COMMENT '账户',
  `role` char(30) NOT NULL default '' COMMENT '角色',
  `join_date` date NOT NULL default '0000-00-00' COMMENT '加入日期',
  `days` smallint(5) unsigned NOT NULL COMMENT '天数',
  `hours` float(2,1) unsigned NOT NULL default '0' COMMENT '小时数',
  PRIMARY KEY  (`project_id`,`account`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='团队表';

-- `project_testresult` 表存储测试结果相关的数据
DROP TABLE IF EXISTS `project_testresult`;
CREATE TABLE IF NOT EXISTS `project_testresult` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '主键ID',
  `run_id` BIGINT unsigned NOT NULL COMMENT '运行ID',
  `case_id` BIGINT unsigned NOT NULL COMMENT '案例ID',
  `version` smallint(5) unsigned NOT NULL COMMENT '版本',
  `case_result` char(30) NOT NULL COMMENT '案例结果',
  `step_results` text NOT NULL COMMENT '步骤结果',
  `last_runner` varchar(30) NOT NULL COMMENT '最后运行者',
  `date` datetime NOT NULL COMMENT '日期',
  PRIMARY KEY  (`id`),
  KEY `testresult` (`case_id`,`version`, `run_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='测试结果表';

-- `project_testrun` 表存储测试运行相关的数据
DROP TABLE IF EXISTS `project_testrun`;
CREATE TABLE IF NOT EXISTS `project_testrun` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '主键ID',
  `task_id` BIGINT unsigned NOT NULL default '0' COMMENT '任务ID',
  `case_id` BIGINT unsigned NOT NULL default '0' COMMENT '案例ID',
  `version` tinyint(3) unsigned NOT NULL default '0' COMMENT '版本',
  `assigned_to` char(30) NOT NULL default '' COMMENT '分配给',
  `last_runner` varchar(30) NOT NULL COMMENT '最后运行者',
  `last_run_date` datetime NOT NULL COMMENT '最后运行日期',
  `last_run_result` char(30) NOT NULL COMMENT '最后运行结果',
  `status` char(30) NOT NULL COMMENT '状态',
  PRIMARY KEY  (`id`),
  UNIQUE KEY `task` (`task_id`,`case_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='测试运行表';

-- `project_testtask` 表存储测试任务相关的数据
DROP TABLE IF EXISTS `project_testtask`;
CREATE TABLE IF NOT EXISTS `project_testtask` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '主键ID',
  `name` char(90) NOT NULL COMMENT '名称',
  `product_id` BIGINT unsigned NOT NULL COMMENT '产品ID',
  `project_id` BIGINT unsigned NOT NULL default '0' COMMENT '项目ID',
  `build` char(30) NOT NULL COMMENT '构建',
  `owner` varchar(30) NOT NULL COMMENT '所有者',
  `pri` tinyint(3) unsigned NOT NULL default '0' COMMENT '优先级',
  `begin_date` date NOT NULL COMMENT '开始日期',
  `end_date` date NOT NULL COMMENT '结束日期',
  `mailto` varchar(255) NOT NULL default '' COMMENT '邮件通知',
  `desc` text NOT NULL COMMENT '描述',
  `report` text NOT NULL COMMENT '报告',
  `status` enum('blocked','doing','wait','done') NOT NULL DEFAULT 'wait' COMMENT '状态',
  `deleted` enum('0','1') NOT NULL default '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `build` (`build`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='测试任务表';

-- `project_todo` 表存储待办事项相关的数据
DROP TABLE IF EXISTS `project_todo`;
CREATE TABLE IF NOT EXISTS `project_todo` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '主键ID',
  `account` char(30) NOT NULL COMMENT '账户',
  `date` date NOT NULL COMMENT '日期',
  `begin_time` smallint(4) unsigned zerofill NOT NULL COMMENT '开始时间',
  `end_time` smallint(4) unsigned zerofill NOT NULL COMMENT '结束时间',
  `type` char(10) NOT NULL COMMENT '类型',
  `id_value` BIGINT unsigned NOT NULL default '0' COMMENT 'ID值',
  `pri` tinyint(3) unsigned NOT NULL COMMENT '优先级',
  `name` char(150) NOT NULL COMMENT '名称',
  `desc` text NOT NULL COMMENT '描述',
  `status`  enum('wait','doing','done') NOT NULL DEFAULT 'wait' COMMENT '状态',
  `private` tinyint(1) NOT NULL COMMENT '私有',
  PRIMARY KEY  (`id`),
  KEY `todo` (`account`,`date`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='待办事项表';


-- project_storyspec表存储故事规格信息
DROP TABLE IF EXISTS `project_storyspec`;
CREATE TABLE IF NOT EXISTS `project_storyspec` (
  `story` BIGINT(20) NOT NULL COMMENT '故事ID',
  `version` smallint(6) NOT NULL COMMENT '版本',
  `title` varchar(90) NOT NULL COMMENT '标题',
  `spec` text NOT NULL COMMENT '规格',
  `verify` text NOT NULL COMMENT '验证',
  UNIQUE KEY `story` (`story`,`version`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- project_storystage表存储故事阶段信息
DROP TABLE IF EXISTS `project_storystage`;
CREATE TABLE IF NOT EXISTS `project_storystage` (
  `story` BIGINT(20) unsigned NOT NULL COMMENT '故事ID',
  `branch` BIGINT(20) unsigned NOT NULL COMMENT '分支ID',
  `stage` varchar(50) NOT NULL COMMENT '阶段',
  KEY `story` (`story`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- 创建project_project表，用于记录项目信息
CREATE TABLE IF NOT EXISTS `project_info` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '项目ID',
  `company` BIGINT unsigned NOT NULL default '0' COMMENT '公司ID',
  `is_cat` enum('1','0') NOT NULL default '0' COMMENT '是否是分类',
  `cat_id` BIGINT unsigned NOT NULL COMMENT '分类ID',
  `type` enum('sprint','project') NOT NULL default 'sprint' COMMENT '类型',
  `parent` BIGINT unsigned NOT NULL default '0' COMMENT '父项目ID',
  `name` varchar(30) NOT NULL default '' COMMENT '项目名称',
  `code` varchar(20) NOT NULL COMMENT '项目代码',
  `begin` date NOT NULL COMMENT '开始日期',
  `end` date NOT NULL COMMENT '结束日期',
  `status` varchar(10) NOT NULL COMMENT '状态',
  `stage` enum('1','2','3','4','5') NOT NULL default '1' COMMENT '阶段',
  `pri` enum('1','2','3','4') NOT NULL default '1' COMMENT '优先级',
  `desc` text NOT NULL COMMENT '描述',
  `goal` text NOT NULL COMMENT '目标',
  `opened_by` varchar(30) NOT NULL default '' COMMENT '创建人',
  `opened_date` BIGINT unsigned NOT NULL default '0' COMMENT '创建日期',
  `closed_by` varchar(30) NOT NULL default '' COMMENT '关闭人',
  `closed_date` BIGINT unsigned NOT NULL default '0' COMMENT '关闭日期',
  `canceled_by` varchar(30) NOT NULL default '' COMMENT '取消人',
  `canceled_date` BIGINT unsigned NOT NULL default '0' COMMENT '取消日期',
  `PO` varchar(30) NOT NULL default '' COMMENT '产品负责人',
  `PM` varchar(30) NOT NULL default '' COMMENT '项目经理',
  `QM` varchar(30) NOT NULL default '' COMMENT '质量负责人',
  `team` varchar(30) NOT NULL COMMENT '团队',
  PRIMARY KEY  (`id`),
  KEY `company` (`company`,`type`,`parent`,`begin`,`end`,`status`,`stage`,`pri`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='项目表';

-- 配置表
CREATE TABLE IF NOT EXISTS `project_config` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '主键ID',
  `owner` char(30) NOT NULL default '' COMMENT '配置拥有者',
  `module` varchar(30) NOT NULL COMMENT '配置所属模块',
  `section` char(30) NOT NULL default '' COMMENT '配置所属部分',
  `key` char(30) NOT NULL default '' COMMENT '配置的键',
  `value` text NOT NULL COMMENT '配置的值',
  PRIMARY KEY  (`id`),
  UNIQUE KEY `unique` (`owner`,`module`,`section`,`key`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='配置表';

-- 计划任务表
CREATE TABLE IF NOT EXISTS `project_cron` (
  `id` BIGINT unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `m` varchar(20) NOT NULL COMMENT '计划任务的分钟',
  `h` varchar(20) NOT NULL COMMENT '计划任务的小时',
  `dom` varchar(20) NOT NULL COMMENT '计划任务的日期',
  `mon` varchar(20) NOT NULL COMMENT '计划任务的月份',
  `dow` varchar(20) NOT NULL COMMENT '计划任务的星期',
  `command` text NOT NULL COMMENT '计划任务的命令',
  `remark` varchar(255) NOT NULL COMMENT '备注',
  `type` varchar(20) NOT NULL COMMENT '类型',
  `buildin` tinyint(1) NOT NULL DEFAULT '0' COMMENT '内建标志',
  `status` varchar(20) NOT NULL COMMENT '状态',
  `last_time` datetime NOT NULL COMMENT '最后运行时间',
  PRIMARY KEY (`id`),
  KEY `last_time` (`last_time`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='计划任务表';

-- 部门表
CREATE TABLE IF NOT EXISTS `project_dept` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '主键ID',
  `name` char(60) NOT NULL COMMENT '部门名称',
  `parent` BIGINT unsigned NOT NULL default '0' COMMENT '父部门ID',
  `path` char(255) NOT NULL default '' COMMENT '部门路径',
  `grade` tinyint(3) unsigned NOT NULL default '0' COMMENT '部门级别',
  `order` tinyint(3) unsigned NOT NULL default '0' COMMENT '排序',
  `position` char(30) NOT NULL default '' COMMENT '部门位置',
  `function` char(255) NOT NULL default '' COMMENT '部门功能',
  `manager` char(30) NOT NULL default '' COMMENT '部门经理',
  PRIMARY KEY (`id`),
  KEY `dept` (`parent`,`path`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='部门表';

-- 扩展表
CREATE TABLE IF NOT EXISTS `project_extension` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '主键ID',
  `name` varchar(150) NOT NULL COMMENT '扩展名称',
  `code` varchar(30) NOT NULL COMMENT '扩展代码',
  `version` varchar(50) NOT NULL COMMENT '版本',
  `author` varchar(100) NOT NULL COMMENT '作者',
  `desc` text NOT NULL COMMENT '描述',
  `license` text NOT NULL COMMENT '许可证',
  `type` varchar(20) NOT NULL default 'extension' COMMENT '类型',
  `site` varchar(150) NOT NULL COMMENT '网站',
  `zentao_compatible` varchar(100) NOT NULL COMMENT '兼容的禅道版本',
  `installed_time` datetime NOT NULL COMMENT '安装时间',
  `depends` varchar(100) NOT NULL COMMENT '依赖',
  `dirs` text NOT NULL COMMENT '目录',
  `files` text NOT NULL COMMENT '文件',
  `status` varchar(20) NOT NULL COMMENT '状态',
  PRIMARY KEY  (`id`),
  UNIQUE KEY `code` (`code`),
  KEY `extension` (`name`,`installed_time`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='扩展表';

-- 文件表
CREATE TABLE IF NOT EXISTS `project_file` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '主键ID',
  `pathname` char(50) NOT NULL COMMENT '文件路径',
  `title` char(90) NOT NULL COMMENT '标题',
  `extension` char(30) NOT NULL COMMENT '扩展名',
  `size` BIGINT unsigned NOT NULL default '0' COMMENT '大小',
  `object_type` char(30) NOT NULL COMMENT '对象类型',
  `object_id` BIGINT NOT NULL COMMENT '对象ID',
  `added_by` char(30) NOT NULL default '' COMMENT '添加者',
  `added_date` datetime NOT NULL COMMENT '添加日期',
  `downloads` BIGINT unsigned NOT NULL default '0' COMMENT '下载次数',
  `extra` varchar(255) NOT NULL COMMENT '额外信息',
  `deleted` enum('0','1') NOT NULL default '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `file` (`object_type`,`object_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='文件表';

-- 邮件队列表
CREATE TABLE IF NOT EXISTS `project_mailqueue` (
  `id` BIGINT unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `to_list` varchar(255) NOT NULL COMMENT '收件人列表',
  `cc_list` varchar(255) NOT NULL COMMENT '抄送人列表',
  `subject` varchar(255) NOT NULL COMMENT '主题',
  `body` text NOT NULL COMMENT '邮件内容',
  `added_by` char(30) NOT NULL COMMENT '添加者',
  `added_date` datetime NOT NULL COMMENT '添加日期',
  `send_time` datetime NOT NULL COMMENT '发送时间',
  `status` varchar(10) NOT NULL DEFAULT 'wait' COMMENT '状态',
  `fail_reason` text NOT NULL COMMENT '失败原因',
  PRIMARY KEY (`id`),
  KEY `send_time` (`send_time`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='邮件队列表';

-- 产品计划表
CREATE TABLE IF NOT EXISTS `project_productplan` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '主键ID',
  `product` BIGINT unsigned NOT NULL COMMENT '产品ID',
  `branch` BIGINT unsigned NOT NULL COMMENT '分支ID',
  `title` varchar(90) NOT NULL COMMENT '标题',
  `desc` text NOT NULL COMMENT '描述',
  `begin` date NOT NULL COMMENT '开始日期',
  `end` date NOT NULL COMMENT '结束日期',
  `deleted` enum('0','1') NOT NULL default '0' COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `plan` (`product`,`end`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='产品计划表';

-- 创建project_user表，用于记录用户信息
CREATE TABLE IF NOT EXISTS `project_user` (
  `id` BIGINT unsigned NOT NULL auto_increment COMMENT '用户ID',
  `company` BIGINT unsigned NOT NULL default '0' COMMENT '公司ID',
  `division` BIGINT unsigned NOT NULL default '0' COMMENT '部门ID',
  `account` char(30) NOT NULL default '' COMMENT '账号',
  `password` char(32) NOT NULL default '' COMMENT '密码',
  `realname` char(30) NOT NULL default '' COMMENT '真实姓名',
  `nickname` char(60) NOT NULL default '' COMMENT '昵称',
  `avatar` char(30) NOT NULL default '' COMMENT '头像',
  `birthyear` smallint(5) unsigned NOT NULL default '0' COMMENT '出生年份',
  `birthday` date NOT NULL default '0000-00-00' COMMENT '生日',
  `gender` enum('f','m') NOT NULL default 'f' COMMENT '性别',
  `email` char(90) NOT NULL default '' COMMENT '邮箱',
  `msn` char(90) NOT NULL default '' COMMENT 'MSN',
  `qq` char(20) NOT NULL default '' COMMENT 'QQ',
  `yahoo` char(90) NOT NULL default '' COMMENT 'Yahoo',
  `gtalk` char(90) NOT NULL default '' COMMENT 'Gtalk',
  `wangwang` char(90) NOT NULL default '' COMMENT '旺旺',
  `mobile` char(11) NOT NULL default '' COMMENT '手机',
  `phone` char(20) NOT NULL default '' COMMENT '电话',
  `address` char(120) NOT NULL default '' COMMENT '地址',
  `zipcode` char(10) NOT NULL default '' COMMENT '邮编',
  `join` date NOT NULL default '0000-00-00' COMMENT '加入日期',
  `visits` BIGINT unsigned NOT NULL default '0' COMMENT '访问次数',
  `ip` char(15) NOT NULL COMMENT 'IP地址',
  `last` BIGINT unsigned NOT NULL default '0' COMMENT '最后登录时间',
  PRIMARY KEY  (`id`),
  KEY `company` (`company`,`division`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 创建project_user_group表，用于记录用户组信息
CREATE TABLE IF NOT EXISTS `project_user_group` (
  `account` char(30) NOT NULL default '' COMMENT '账号',
  `group` BIGINT unsigned NOT NULL default '0' COMMENT '组ID',
  UNIQUE KEY `account` (`account`,`group`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='用户组表';
