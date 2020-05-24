package com.jnh.investment.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jnh.investment.common.utils.PageUtils;
import com.jnh.investment.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author wangsixian
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
