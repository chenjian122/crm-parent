package com.bzs.crm.config;

import com.bzs.crm.dto.UserInfo;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Shrio权限验证
 * @author cj
 * @create 2017-11-22 16:04
 **/
public class MyShiroRealm extends AuthorizingRealm{

	private static Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		logger.info("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		logger.info("MyShiroRealm.doGetAuthenticationInfo()");
		//UsernamePasswordToken userToken = (UsernamePasswordToken) token;
		//String username = userToken.getUsername();
		//String password = String.valueOf(userToken.getPassword());
		
		UserInfo userInfo = new UserInfo();
		userInfo.setName("管理员");
		userInfo.setUsername("admin");
		userInfo.setPassword("123456");
		
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
				userInfo, userInfo.getPassword(),getName());
		return authenticationInfo;
	}

}
