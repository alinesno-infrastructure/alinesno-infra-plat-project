你现在充当一名高级Java开发工程师，擅长springboot和mybatis-plus，现在在做一个项目管理系统，现在已经写好一部分代码，

请根据接口需求在controller里面编写实现代码，同时编写详细的注释信息，描述接口作用，接口返回AjaxResult信息; 
请完善和编写service编写代码，同时编写详细的注释信息，描述接口作用，请编写完整代码。

请添加详细的接口注释，描述每个接口的作用，下面是接口的需求列表：

1. 获取项目列表 GET /projects
	请求参数
	名称	类型	必填	描述
	page	String		第几页，默认为1
	limit	String		每页项目数量，默认20
2. 创建项目POST /projects
	请求体
	名称	类型	必填	描述
	name	string	是	项目名称
	begin	date	是	计划开始日期
	end	date	是	计划结束日期
	products	array	是	关联产品，比如 [1, 2]，不能为空。
	code	string	是	项目编号
	model	string	否	项目模型，默认为scrum
	parent	int	否	所属项目集，默认为0
3. 获取项目详情 GET /projects/:id
	请求响应
	名称	类型	必填	描述
	id	int	是	项目编号
	parent	int	是	所属项目集
	model	string	是	项目模型(scrum 敏捷 | waterfall 瀑布)
	budget	int	是	项目预算金额
	budgetUnit	string	是	预算币种(CNY | USD)
	name	string	是	项目名称
	code	string	是	项目编号
	begin	date	是	计划开始日期
	end	date	是	计划结束日期
	realBegan	date	是	实际开始日期
	realEnd	date	是	实际结束日期
	status	string	是	项目状态(wait 未开始 | doing 进行中 | suspend 已挂起 | closed 已关闭)
	desc	string	是	项目描述
	openedBy		是	创建人
	openedDate	datetime	是	创建时间
	PM		是	项目负责人
	acl	string	是	访问控制(open 公开 | private 私有)
	whitelist	array	是	白名单
4. 修改项目 PUT /projects/:id
	请求体
	名称	类型	必填	描述
	name	string	否	项目名称
	code	string	否	项目代号
	parent	int	否	所属项目集
	PM	int	否	项目负责人
	budget	int	否	项目预算金额
	budgetUnit	string	否	预算币种(CNY | USD)
	days	int	否	可用工作日
	desc	string	否	项目描述
	acl	string	否	访问控制(open 公开 | private 私有)
	whitelist	array	否	白名单
	auth	string	否	权限控制(extend 继承 | reset 重新定义)
5. 删除项目 DELETE /projects/:id

下面是已经实现的entity/service/serviceImpl/mapper/controller类：

@RestController
@RequestMapping("/project_info")
public class ProjectInfoController extends BaseController<ProjectInfoEntity, ProjectInfoService> {
    // 可以添加一些特殊的控制器方法
}


public interface ProjectInfoService extends IBaseService<ProjectInfoEntity> {
    // 可以添加一些特殊的服务方法
}


@Service
public class ProjectInfoServiceImpl extends IBaseServiceImpl<ProjectInfoEntity, ProjectInfoMapper> implements ProjectInfoService {
    // 可以添加一些特殊的服务实现
}


/**
 * ProjectInfoEntity实体类，对应于数据库中的project_info表。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_info")
public class ProjectInfoEntity extends BaseEntity {
    /**
     * 公司ID
     */
    @TableField("company")
    private Long company;

    /**
     * 是否为分类
     */
    @TableField("is_cat")
    private String isCat;

    /**
     * 分类ID
     */
    @TableField("cat_id")
    private Long catId;

    /**
     * 类型
     */
    @TableField("type")
    private String type;

    /**
     * 父项目ID
     */
    @TableField("parent")
    private Long parent;

    /**
     * 项目名称
     */
    @TableField("name")
    private String name;

    /**
     * 项目代码
     */
    @TableField("code")
    private String code;

    /**
     * 项目开始日期
     */
    @TableField("begin")
    private LocalDate begin;

    /**
     * 项目结束日期
     */
    @TableField("end")
    private LocalDate end;

    /**
     * 项目状态
     */
    @TableField("status")
    private String status;

    /**
     * 项目阶段
     */
    @TableField("stage")
    private String stage;

    /**
     * 项目优先级
     */
    @TableField("pri")
    private String pri;

    /**
     * 项目描述
     */
    @TableField("desc")
    private String desc;

    /**
     * 项目目标
     */
    @TableField("goal")
    private String goal;

    /**
     * 项目开启者
     */
    @TableField("opened_by")
    private String openedBy;

    /**
     * 项目开启日期
     */
    @TableField("opened_date")
    private Long openedDate;

    /**
     * 项目关闭者
     */
    @TableField("closed_by")
    private String closedBy;

    /**
     * 项目关闭日期
     */
    @TableField("closed_date")
    private Long closedDate;

    /**
     * 项目取消者
     */
    @TableField("canceled_by")
    private String canceledBy;

    /**
     * 项目取消日期
     */
    @TableField("canceled_date")
    private Long canceledDate;

    /**
     * 项目所有者
     */
    @TableField("PO")
    private String PO;

    /**
     * 项目经理
     */
    @TableField("PM")
    private String PM;

    /**
     * 质量管理者
     */
    @TableField("QM")
    private String QM;

    /**
     * 项目团队
     */
    @TableField("team")
    private String team;
}
