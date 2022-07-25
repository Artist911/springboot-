package com.example.encodingfilter.config;

import com.example.encodingfilter.servlrt.myser;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class systemConfig {

    @Bean
    /*
    *吧servlet放进去
    * */
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new myser());
        bean.addUrlMappings("/my");
        return bean;
    }
    @Bean
    /*
    * 使用字符过滤器
    *
    * */
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean =new FilterRegistrationBean();
        //使用框架中过滤器
        CharacterEncodingFilter filter =new CharacterEncodingFilter();
        filter.setEncoding("utf-8");
        //指定resp req 都使用这个过滤器
        filter.setForceEncoding(true);

        bean.setFilter(filter);
        bean.addUrlPatterns("/*");
        return bean;
    }

}
