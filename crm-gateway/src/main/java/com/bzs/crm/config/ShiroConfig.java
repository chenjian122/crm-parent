package com.bzs.crm.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.shiro.mgt.SecurityManager;

/**
 * Shiro Filter配置
 * @author cj
 * @create 2017-11-22 17:01
 **/
@Configuration
public class ShiroConfig {

	private static Logger logger = LoggerFactory.getLogger(ShiroConfig.class);

	@Bean
	public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {

		logger.info("ShiroConfiguration.shirFilter");
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		//拦截器
		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String,String>();
		//配置不会被拦截的链接
		filterChainDefinitionMap.put("/static/**", "anon");
		//配置退出过滤器
		filterChainDefinitionMap.put("/logout", "logout");
		//authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问
		filterChainDefinitionMap.put("/**", "authc");
		shiroFilterFactoryBean.setLoginUrl("/login");
		// 登录成功后要跳转的链接
		shiroFilterFactoryBean.setSuccessUrl("/index");
		//未授权界面;
		shiroFilterFactoryBean.setUnauthorizedUrl("/403");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
		return shiroFilterFactoryBean;
	}

	@Bean
	public MyShiroRealm myShiroRealm(){
		MyShiroRealm myShiroRealm = new MyShiroRealm();
		return myShiroRealm;
	}
	
	@Bean
	public SecurityManager securityManager(){
		DefaultWebSecurityManager securityManager =  new DefaultWebSecurityManager();
		securityManager.setRealm(myShiroRealm());
		return securityManager;
	}
}
