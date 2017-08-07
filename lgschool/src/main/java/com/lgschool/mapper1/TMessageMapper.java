package com.lgschool.mapper1;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import com.lgschool.po.TMessage;

public interface TMessageMapper extends Mapper<TMessage>, MySqlMapper<TMessage> {
   
}