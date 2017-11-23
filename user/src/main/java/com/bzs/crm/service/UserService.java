package com.bzs.crm.service;

import com.bzr.crm.exception.ServiceException;
import com.bzs.crm.dto.UserDto;

/**
 * 用户接口
 * @author cj
 * @create 2017-11-23 13:41
 **/
public interface UserService {

    UserDto getUserInfo(int userId) throws ServiceException;
}
