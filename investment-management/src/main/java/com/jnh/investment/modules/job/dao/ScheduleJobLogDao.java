package com.jnh.investment.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jnh.investment.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author wangsixian
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {

}
