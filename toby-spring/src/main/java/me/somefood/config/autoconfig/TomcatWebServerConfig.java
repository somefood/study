package me.somefood.config.autoconfig;

import me.somefood.config.ConditionalMyOnClass;
import me.somefood.config.MyAutoConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@MyAutoConfiguration
@ConditionalMyOnClass("org.apache.catalina.startup.Tomcat")
public class TomcatWebServerConfig {

//    @Value("${contextPath:}")
//    String contextPath;
//
//    @Value("${port:8080}") // 없는 경우 : 뒤에 값 사용
//    int port;

    @Bean("tomcatWebServerFactory")
    @ConditionalOnMissingBean // 사용자 구성 정보가 먼저 찾아보고 없으면 등록해줌
    public ServletWebServerFactory servletWebServerFactory(ServerProperties properties) {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.setContextPath(properties.getContextPath());
        factory.setPort(properties.getPort());
        return factory;
    }
}
