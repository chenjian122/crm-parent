package com.bzs.crm.dao;

import com.bzs.crm.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * @author cj
 * @create 2017-11-23 13:51
 **/
@Mapper
public interface UserMapper {

    User getById(int userId);
}
