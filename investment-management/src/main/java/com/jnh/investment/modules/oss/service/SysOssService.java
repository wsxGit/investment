package com.jnh.investment.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jnh.investment.common.utils.PageUtils;
import com.jnh.investment.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author wangsixian
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
