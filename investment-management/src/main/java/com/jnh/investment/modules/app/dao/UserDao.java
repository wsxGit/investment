package com.jnh.investment.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jnh.investment.modules.app.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author wangsixian
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
