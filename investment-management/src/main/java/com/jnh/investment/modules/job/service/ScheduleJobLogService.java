package com.jnh.investment.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jnh.investment.common.utils.PageUtils;
import com.jnh.investment.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author wangsixian
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);

}
