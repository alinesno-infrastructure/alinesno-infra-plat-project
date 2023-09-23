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