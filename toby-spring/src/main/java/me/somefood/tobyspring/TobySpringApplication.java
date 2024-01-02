package me.somefood.tobyspring;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class TobySpringApplication {

    // 스프링 구성 다 되고 실행되는 코드
//    @Bean
//    ApplicationRunner applicationRunner(Environment env) {
//        return args -> {
//            String name = env.getProperty("my.name");
//            System.out.println("my.name: " + name);
//        };
//    }
    private final JdbcTemplate jdbcTemplate;

    public TobySpringApplication(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
        // InitializingBean 을 간결하게 쓸 수 있는 방법
    void init() {
        jdbcTemplate.execute("create table if not exists hello(name varchar(50) primary key, count int)");
    }

    public static void main(String[] args) {
        SpringApplication.run(TobySpringApplication.class, args);
    }
}
