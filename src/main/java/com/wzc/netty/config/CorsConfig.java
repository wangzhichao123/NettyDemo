package com.wzc.netty.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class CorsConfig extends WebMvcConfigurationSupport {
    /**
     * 加载静态资源
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //加载classpath等静态资源，用于访问swagger，以及webapp下的静态资源
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/META-INF/resources/");
        //加载static下的静态资源
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        //加载web-inf 目录下的文件
        registry.addResourceHandler("/web-api/**").addResourceLocations("/WEB-INF/web-api/");
        //加上file:静态资源，用于访问本地图片
        //images/**和file:E://images/对应application.properties上面的配置
        //registry.addResourceHandler("/images/**").addResourceLocations("file:E://PDF/");

        super.addResourceHandlers(registry);
    }

    /**
     * 允许跨域
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH")
                .allowCredentials(true).maxAge(3600);
    }


}

