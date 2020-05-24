<template>
  <div class="container" style="height:100%">
    <div class="top">
      <!-- <el-breadcrumb separator="/">
        <el-breadcrumb-item>首页</el-breadcrumb-item>
        <el-breadcrumb-item>工作台</el-breadcrumb-item>
      </el-breadcrumb>-->

      <el-row>
        <el-col :span="2">
          <div>
            <img src="~@/assets/img/avatar.png" alt />
          </div>
        </el-col>
        <el-col :span="13" style="position:relative;right:2%;top:33px;">
          <div>
            <h3>早安，admin，祝你开心每一天！</h3>
            <h4>交互专家 | 交互专家</h4>
          </div>
        </el-col>
        <el-col :span="3" style="margin-top:15px;">
          <div>
            <h2>新增项目数</h2>
            <h1>22</h1>
          </div>
        </el-col>
        <el-col :span="3" style="margin-top:15px;">
          <div>
            <h2>新增投资人</h2>
            <h1>22</h1>
          </div>
          <div class="line"></div>
        </el-col>
        <el-col :span="3" style="margin-top:15px;">
          <div>
            <h2>新增投资人</h2>
            <h1>22</h1>
          </div>
          <div class="line"></div>
        </el-col>
      </el-row>
    </div>

    <div class="content">
      <el-row>
        <el-col :span="15">
          <div class="allow">
            <div class="a-top">
              <el-row type="flex" justify="space-between">
                <el-col :span="3" class="at-left">待我审批</el-col>
                <el-col :span="3" class="at-right">more</el-col>
              </el-row>
            </div>
            <div class="a-content">
              <div class="ac-box" v-for="(item,index) in 6" :key="index">
                <div class="ab-top">
                  <img src="~@/assets/img/avatar.png" alt />
                  <span>&nbsp;&nbsp;项目立项审批</span>
                </div>
                <div class="h1">这是一条描述信息这是一条描述信息这是一条描述信息</div>
                <div class="ab-bottom">
                  <div>管伟名</div>
                  <div>5小时前</div>
                </div>
              </div>
            </div>
          </div>
          <div class="message">
            <div class="a-top">
              <el-row type="flex" justify="space-between">
                <el-col :span="3" class="at-left">消息通知</el-col>
                <el-col :span="3" class="at-right">more</el-col>
              </el-row>
              <el-tabs v-model="activeName">
                <el-tab-pane label="全部" name="first">
                  <div class="mlist" v-for="(item,index) in 4" :key="index">
                    <el-row :gutter="50">
                      <el-col :span="1">
                        <img src="~@/assets/img/avatar.png" alt />
                      </el-col>
                      <el-col :span="15">
                        <div style="margin-top:15px;">
                          <span style="font-weight:500">林东东</span> 向您提交了项目
                          <span style="color:rgba(75, 131, 243, 1);cursor: pointer;">【林东东日报】</span>
                        </div>
                        <div style="color:rgba(111, 111, 111, 1)">2 分钟前</div>
                      </el-col>
                    </el-row>
                  </div>
                </el-tab-pane>
                <el-tab-pane label="已读" name="second"></el-tab-pane>
                <el-tab-pane label="未读" name="third"></el-tab-pane>
              </el-tabs>
            </div>
          </div>
        </el-col>
        <el-col :span="8" style="margin-left:2.2%;">
          <el-calendar v-model="value">
          </el-calendar>
          <div class="time">
            <div class="t-top">我的日程</div>
            <div class="tlist" v-for="(item,index) in 4" :key="index">
              <h1>全体员工晨会</h1>
              <h2>2020.01.09 09:00:00 - 2020.01.09 09:00:00</h2>
            </div>
          </div>
        </el-col>
      </el-row>
    </div>
  </div>

</template>

<script>
  export default {
    data () {
      return {
        activeName: 'first',
        value: new Date()
      }
    }
  }
</script>

<style lang="scss" scoped>
  .container {
    height: 100%;
    background: rgb(234, 230, 236);
    .top {
      width: 100%;
      height: 134px;
      background: white;
      padding-left: 1.1%;
      padding-top: 16px;
      img {
        width: 72px;
        height: 72px;
        margin-top: 20px;
      }
      h1 {
        text-align: center;
        font-size: 30px;
        font-family: HelveticaNeue;
        color: rgba(0, 0, 0, 0.85);
        margin-top: 10px;
        font-weight: 400;
      }
      h2 {
        text-align: center;
        color: rgba(111, 111, 111, 1);
      }
      h3 {
        font-size: 20px;
        font-weight: 500;
      }
      h4 {
        font-size: 14px;
        font-weight: 400;
        color: rgba(111, 111, 111, 1);
      }
      .line {
        width: 1px;
        height: 40px;
        background: rgba(233, 233, 233, 1);
        position: relative;
        top: -80px;
      }
    }

    .content {
      padding-left: 2.6%;
      margin-top: 17px;
      .allow {
        width: 100%;
        height: 369px;
        background: white;
        .a-top {
          text-align: center;
          height: 55px;
          line-height: 55px;
          border-bottom: 1px solid rgba(233, 233, 233, 1);
          .at-left {
            font-size: 16px;
            font-weight: 500;
            color: rgba(0, 0, 0, 0.85);
          }
          .at-right {
            font-size: 14px;
            font-weight: 400;
            color: rgba(75, 131, 243, 1);
            cursor: pointer;
          }
        }

        .a-content {
          height: 314px;
          display: flex;
          flex-wrap: wrap;
          .ac-box {
            width: 28%;
            height: 50%;
            border: 1px solid rgba(233, 233, 233, 1);
            border-top: none;
            border-left: none;
            padding-left: 2.6%;
            padding-right: 2.6%;
            position: relative;
            // background: red;
            .ab-top {
              height: 60px;
              line-height: 60px;
              font-size: 14px;
              font-family: PingFangSC-Medium, PingFang SC;
              font-weight: 500;
              color: rgba(0, 0, 0, 0.85);
              img {
                width: 24px;
                height: 24px;
                position: relative;
                top: 5px;
              }
            }
            .h1 {
              font-size: 14px;
              font-family: PingFangSC-Regular, PingFang SC;
              font-weight: 400;
              color: rgba(111, 111, 111, 1);
              margin: 0;
              display: -webkit-box;
              -webkit-box-orient: vertical;
              -webkit-line-clamp: 2;
              overflow: hidden;
            }
            .ab-bottom {
              width: 82%;
              height: 52px;
              line-height: 52px;
              font-size: 12px;
              font-family: PingFangSC-Regular, PingFang SC;
              font-weight: 400;
              color: rgba(0, 0, 0, 0.45);
              position: absolute;
              bottom: 0;
              display: flex;
              justify-content: space-between;
            }
          }
          .ac-box:nth-child(3) {
            border-right: none;
          }
          .ac-box:nth-child(6) {
            border-right: none;
          }
        }
      }
      .message {
        width: 100%;
        height: 429px;
        background: white;
        margin-top: 16px;
        overflow: hidden;
        .a-top {
          text-align: center;
          height: 90px;
          line-height: 55px;
          .at-left {
            font-size: 16px;
            font-weight: 500;
            color: rgba(0, 0, 0, 0.85);
          }
          .at-right {
            font-size: 14px;
            font-weight: 400;
            color: rgba(75, 131, 243, 1);
            cursor: pointer;
          }
          .mlist {
            height: 83px;
            width: 97%;
            margin: 0 auto;
            border-bottom: 1px solid rgba(232, 232, 232, 1);
            .el-row {
              height: 100%;
              .el-col {
                text-align: left;
                line-height: 30px;
                img {
                  width: 32px;
                  height: 32px;
                  margin-top: 16px;
                }
              }
            }
          }
        }
      }
      .time {
        width: 100%;
        height: 815px;
        background: white;
        .t-top {
          height: 55px;
          border-bottom: 1px solid rgba(233, 233, 233, 1);
          font-size: 16px;
          font-family: PingFangSC-Medium, PingFang SC;
          font-weight: 500;
          color: rgba(0, 0, 0, 0.85);
          line-height: 55px;
          padding-left: 2.6%;
        }
        .tlist {
          width: 90%;
          height: 72px;
          margin: 0 auto;
          background-image: url("/src/assets/img/hbj.png");
          background-size: 100% 100%;
          margin-top: 20px;
          font-family: PingFangSC-Regular, PingFang SC;
          font-weight: 400;
          padding-left: 5%;
          h1 {
            color: rgba(51, 51, 51, 1);
            padding-top: 10px;
          }
          h2 {
            color: rgba(111, 111, 111, 1);
            font-size: 14px;
            margin-top: 10px;
          }
        }
      }
    }
  }
</style>

<style>
  .a-top .el-tabs__header {
    padding: 0;
    position: relative;
    top: -16px;
    /* left: 3%; */
    margin: 0 0 15px;
    font-size: 14px;
  }

  .a-top .el-tabs__active-bar {
    position: absolute;
    bottom: 0;
    left: -15px;
    height: 2px;
    background-color: #409eff;
    width: 60px !important;
    z-index: 1;
    transition: transform 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
    list-style: none;
  }
  .a-top .el-tabs--top .el-tabs__item.is-top:nth-child(2) {
    padding-left: 30px;
  }

  .a-top .el-tabs__content {
    overflow: hidden;
    position: relative;
    top: -30px;
  }

  .time .el-calendar__body {
    padding: 12px 20px 0px;
  }

  .time .el-calendar-table .el-calendar-day {
    box-sizing: border-box;
    padding: 8px;
    height: 40px;
    text-align: center;
  }
  .time .el-calendar-table tr td:first-child {
    border: none;
  }
  .time .el-calendar-table tr:first-child td {
    border: none;
  }

  .time .el-calendar-table td {
    border: none;
    vertical-align: middle !important;
    transition: background-color 0.2s ease;
  }
</style>


