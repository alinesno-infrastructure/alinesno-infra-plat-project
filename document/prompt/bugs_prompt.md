你现在充当一名高级Java开发工程师，擅长springboot和mybatis-plus，现在在做一个项目管理系统，现在已经写好一部分代码，

请根据接口需求在controller里面编写实现代码和DTO实体类编写，同时编写详细的注释信息，描述接口作用，接口返回AjaxResult信息; 
请完善和编写service编写代码，同时编写详细的注释信息，描述接口作用，请编写完整代码。

请添加详细的接口注释，描述每个接口的作用，下面是接口的需求列表：

1. 获取产品Bug列表 GET /products/:id/bugs

	请求响应
	名称	类型	必填	描述
	page	int	是	当前页数
	total	int	是	Bug总数
	limit	int	是	每页Bug数
	bugs	array	是	Bug列表
	  ∟  id	int	是	Bug ID
	  ∟  product	int	是	所属产品
	  ∟  branch	int	是	所属分支
	  ∟  module	int	是	所属模块
	  ∟  project	int	是	所属项目
	  ∟  execution	int	是	所属执行
	  ∟  toTask	int	是	转为任务
	  ∟  toStory	int	是	转为需求
	  ∟  title	string	是	Bug标题
	  ∟  keywords	string	是	关键字
	  ∟  severity	int	是	严重程度
	  ∟  pri	int	是	优先级
	  ∟  type	string	是	Bug类型(codeerror 代码错误 | config 配置相关 | install 安装部署 | security 安全相关 | performance 性能问题 | standard 标准规范 | automation |测试脚本 | designdefect 设计缺陷 | others 其他)
	  ∟  os	string	否	操作系统
	  ∟  browser	string	否	浏览器
	  ∟  steps	string	是	重现步骤
	  ∟  task	int	否	相关任务
	  ∟  story	int	否	相关需求
	  ∟  openedBy		是	创建人
	  ∟  openedDate	datetime	是	创建时间
	  ∟  deadline	date	否	截止日期
	  ∟  assignedTo		否	指派给
	  ∟  assignedDate	datetime	否	指派时间
	  ∟  resolvedBy		否	由谁解决
	  ∟  resolvedDate	datetime	否	解决时间
	  ∟  resolvedBuild	string	否	解决版本
	  ∟  closedBy		否	由谁关闭
	  ∟  closedDate	datetime	否	关闭时间

2. 创建Bug POST /products/:id/bugs
	请求体
	名称	类型	必填	描述
	branch	int	否	所属分支
	module	int	否	所属模块
	execution	int	否	所属执行
	title	string	是	Bug标题
	keywords	string	否	关键词
	severity	int	是	严重程度
	pri	int	是	优先级
	type	string	是	Bug类型(codeerror 代码错误 | config 配置相关 | install 安装部署 | security 安全相关 | performance 性能问题 | standard 标准规范 | automation |测试脚本 | designdefect 设计缺陷 | others 其他)
	os	string	否	操作系统
	browser	string	否	浏览器
	steps	string	否	重现步骤
	task	int	否	相关任务
	story	int	否	相关需求
	deadline	date	否	截止日期
	openedBuild	array	否	影响版本

3. 获取Bug详情 GET /bugs/: 
	请求响应
	名称	类型	必填	描述
	id	int	是	Bug ID
	product	int	是	所属产品
	branch	int	是	所属分支
	module	int	是	所属模块
	project	int	是	所属项目
	execution	int	是	所属执行
	toTask	boolean	否	转为任务
	toStory	boolean	否	转为需求
	title	string	是	Bug标题
	keywords	string	否	关键字
	severity	int	是	严重程度
	pri	int	是	优先级
	type	string	否	Bug类型(codeerror 代码错误 | config 配置相关 | install 安装部署 | security 安全相关 | performance 性能问题 | standard 标准规范 | automation |测试脚本 | designdefect 设计缺陷 | others 其他)
	os	string	否	操作系统
	browser	string	否	浏览器
	steps	string	否	重现步骤
	task	int	否	相关任务
	story	int	否	相关需求
	openedBy	string	是	创建人
	openedDate	datetime	是	创建时间
	deadline	date	否	截止日期
	assignedTo		否	指派给
	assgnedDate	datetime	否	指派时间
	resolvedBy		否	由谁解决
	resolvedDate	datetime	否	解决时间
	resolvedBuild	string	否	解决版本
	closedBy		否	由谁关闭
	closedDate	datetime	否	关闭时间
	status	string	是	状态(active 激活 | resolved 已解决 | closed 已关闭)
 
4. 修改Bug PUT /bugs/:id
	请求体
	名称	类型	必填	描述
	branch	int	否	所属分支
	module	int	否	所属模块
	execution	int	否	所属执行
	title	string	是	Bug标题
	keywords	string	否	关键词
	severity	int	是	严重程度
	pri	int	是	优先级
	type	string	是	Bug类型(codeerror 代码错误 | config 配置相关 | install 安装部署 | security 安全相关 | performance 性能问题 | standard 标准规范 | automation |测试脚本 | designdefect 设计缺陷 | others 其他)
	os	string	否	操作系统
	browser	string	否	浏览器
	steps	string	否	重现步骤
	task	int	否	相关任务
	story	int	否	相关需求
	deadline	date	否	截止日期
	openedBuild	array	否	影响版本

5. 删除Bug DELETE /bugs/:id

下面是已经实现的entity/service/serviceImpl/mapper/controller类：


























 