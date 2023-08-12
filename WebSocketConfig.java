package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * WebSocket 지원을 위한 설정 클래스. WebSocket을 구성하고 활성화합니다.
 */

//WebMvcConfigurationSupport클래스를 상속받음
@Configuration
public class WebSocketConfig extends WebMvcConfigurationSupport {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        // 상대 경로
        registry.addResourceHandler("image/**").addResourceLocations("classpath:/static/image/");
        // 절대 경로
        // registry.addResourceHandler("image/**").addResourceLocations("file:" + "image/");
    }
}
