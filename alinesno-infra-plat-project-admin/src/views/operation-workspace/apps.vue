<template>
  <div>
    <el-row class="acp-dashboard-panel" :gutter="20">
      <el-col class="panel-col" :span="19">
        <div class="grid-content">
          <div class="panel-header">
            <div class="header-title"><i class="fa-solid fa-link"></i> 服务集成教程</div>
          </div>
          <div class="panel-body" style="height: auto;position: relative;">
              <div class="direct-box">
                <ul>
                  <li class="box-item" v-for="item in directContent" :key="item">
                    <div class="dire-panel">
                      <div class="panel-title">
                        <img class="dire-panel-icon" :src="item.icon" :alt="item.name" />
                        {{ item.name }} 
                      </div>
                      <div class="panel-describe">{{ item.desc }}</div>
                      <div class="panel-tip">访问链接</div>
                    </div>
                  </li>
                </ul>
              </div>
          </div>
        </div>
      </el-col>
      <el-col :span="5">
        <div class="grid-content">
          <div class="panel-header">
            <div class="header-title"><i class="fa-solid fa-link"></i> 构建解决方案</div>
          </div>
          <div class="panel-body" style="height: auto;position: relative;">
            <div class="acp-app-list">
              <ul>
                <li class="app-items" style="width:100%" v-for="item in apps" :key="item">
                  <div class="app-icon">
                    <img :src="item.icon" :alt="item.name" />
                  </div>
                  <div class="app-info">
                    <div class="app-item-title">{{ item.name }} <i class="fa-solid fa-arrow-up-right-from-square"></i>
                    </div>
                    <div class="app-item desc">{{ item.desc }}</div>
                  </div>
                </li>
              </ul>
            </div>
          </div>

        </div>
      </el-col>
    </el-row>

  </div>
</template>

<script setup>

const directContent = ref([
  {
    "icon": "https://d1by4p17n947rt.cloudfront.net/icon/d88319dfa5d204f019b4284149886c59-7d586ea82f792b61a8c87de60565133d.svg",
    "name": "集成微信客户端",
    "desc": "用于实现与微信客户端的集成功能，方便与微信用户进行交互和消息传递"
  },
  {
    "icon": "https://d1by4p17n947rt.cloudfront.net/icon/f5d2c00d40914bff4f82f29f9ef768bc-53a84099cf556710383a52b4612a8612.svg",
    "name": "第三方任务导入",
    "desc": "支持从第三方平台导入任务的功能，方便将外部任务数据导入到系统中进行管理"
  },
  {
    "icon": "https://d1by4p17n947rt.cloudfront.net/icon/3da5e8169d2f1426f99fbef54575fe96-6382cb2dfdd2f74c99bc8a64a338358e.svg",
    "name": "任务角色管理",
    "desc": "用于管理任务角色的功能，包括创建、编辑和删除任务角色，以及分配任务给不同的角色"
  },
  {
    "icon": "https://d1by4p17n947rt.cloudfront.net/icon/fb0cde6228b21d89ec222b45efec54e7-0856e92285f4e7ed254b2588d1fe1829.svg",
    "name": "集成流程管理服务",
    "desc": "提供集成流程管理的服务，用于定义和管理系统中的业务流程，包括流程设计、流程执行和流程监控"
  },
  {
    "icon": "https://d1by4p17n947rt.cloudfront.net/icon/a5ffe5487f62ef75d8e5cf78c18525a5-d4867f9d4adcd749f0c5aff987232847.svg",
    "name": "接入工单管理服务",
    "desc": "提供接入工单管理的服务，用于接收和处理用户提交的工单请求，包括工单创建、分配、处理和关闭"
  }
]);

const apps = ref([
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/fb0cde6228b21d89ec222b45efec54e7-0856e92285f4e7ed254b2588d1fe1829.svg', name: '项目管理解决方案', desc: '项目管理解决方案' },
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/051de32597041e41f73b97d61c67a13b-9cbdaf85e3bcf29b656fdedd8e6d1305.svg', name: '工单管理解决方案', desc: '工单管理解决方案' },
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/7177e919b32ad97825f95e902595014b-1594766d92813b5baeb706c453f91de0.svg', name: '定制化任务进度解决方案', desc: '定制化任务进度解决方案' },
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/fb0cde6228b21d89ec222b45efec54e7-0856e92285f4e7ed254b2588d1fe1829.svg', name: '个人云笔记集成方案', desc: '个人云笔记集成方案' },
  { icon: 'https://d1by4p17n947rt.cloudfront.net/icon/9da5a168cf8194c8ee5ed192a443d563-674375b53bc8ae94f48cfdb5c81e8363.svg', name: '第三方系统集成方案', desc: '第三方系统集成方案' },
]);

</script>