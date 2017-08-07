package com.lgschool.mapper1;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.lgschool.po.TUser;

public interface TUserMapper extends Mapper<TUser>, MySqlMapper<TUser> {
   
}