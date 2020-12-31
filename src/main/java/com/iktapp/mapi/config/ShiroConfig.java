package com.iktapp.mapi.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description
 * @Author Zhenya Qian
 * @Date 2020/9/1 16:14
 */
@Configuration
public class ShiroConfig
{

//    @Bean
//    public ShiroFilterFactoryBean webFilter()
//    {
//        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
//        //配置拦截链 使用LinkedHashMap,因为LinkedHashMap是有序的，shiro会根据添加的顺序进行拦截
//        // Map<K,V> K指的是拦截的url V值的是该url是否拦截
//        Map<String, String> filterChainMap = new LinkedHashMap<>();
//
//        //authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问,先配置anon再配置authc。
//        filterChainMap.put("/login", "anon");
//        filterChainMap.put("/**", "authc");
//
//        //设置拦截请求后跳转的URL.
//        bean.setLoginUrl("/login");
//        bean.setFilterChainDefinitionMap(filterChainMap);
//        return bean;
//    }

}
