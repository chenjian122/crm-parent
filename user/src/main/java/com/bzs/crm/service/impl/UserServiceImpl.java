package com.bzs.crm.service.impl;

import com.bzr.crm.exception.ServiceException;
import com.bzs.crm.dao.UserMapper;
import com.bzs.crm.dto.UserDto;
import com.bzs.crm.entity.User;
import com.bzs.crm.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户处理
 * @author cj
 * @create 2017-11-23 13:45
 **/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public UserDto getUserInfo(int userId) throws ServiceException{
        UserDto userInfo = new UserDto();
        try {
            User user = userMapper.getById(userId);
            if(user !=null){
                BeanUtils.copyProperties(user,userInfo);
            }
        }catch (Exception e){
            throw new ServiceException(e.getMessage());
        }
        return userInfo;
    }
}
