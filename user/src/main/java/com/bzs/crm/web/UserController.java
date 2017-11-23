package com.bzs.crm.web;

import com.bzr.crm.exception.JSONException;
import com.bzr.crm.exception.ServiceException;
import com.bzs.crm.dto.UserDto;
import com.bzs.crm.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户Controller
 * @author cj
 * @create 2017-11-22 16:36
 **/
@RestController
@RequestMapping("/")
@Api(value="用户controller",tags={"用户操作接口"})
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ApiOperation(value="获取用户详细信息", notes="根据用户id来获取用户详细信息")
    @RequestMapping(value="/getUserInfo/{userId}",method= RequestMethod.GET)
    public UserDto getUserInfo(@ApiParam(name="userId", value="用户id", required=true)@PathVariable Integer userId)throws JSONException{
        UserDto user = null;
        try {
            user = userService.getUserInfo(userId);
        } catch (ServiceException e) {
            logger.error(e.getMessage());
            throw new JSONException(e.getMessage());
        }
        return user;
    }

}
