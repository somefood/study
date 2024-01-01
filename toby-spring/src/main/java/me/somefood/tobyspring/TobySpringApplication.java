package me.somefood.tobyspring;

import me.somefood.config.MySpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@MySpringBootApplication
public class TobySpringApplication {

    // 스프링 구성 다 되고 실행되는 코드
//    @Bean
//    ApplicationRunner applicationRunner(Environment env) {
//        return args -> {
//            String name = env.getProperty("my.name");
//            System.out.println("my.name: " + name);
//        };
//    }

    public static void main(String[] args) {
        SpringApplication.run(TobySpringApplication.class, args);
    }
}
