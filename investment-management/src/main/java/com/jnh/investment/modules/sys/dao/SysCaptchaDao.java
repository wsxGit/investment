package com.jnh.investment.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jnh.investment.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author wangsixian
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
