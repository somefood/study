package me.seokju.spring.mvc.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DemoApplicationRunner implements ApplicationRunner {

    @Value("${test}")
    private String test;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("test profile is : " + test);
        System.out.println("ApplicationRunner Args: " + Arrays.toString(args.getSourceArgs()));
    }
}
