package me.somefood.tobyspring;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component // 메타 어노테이션에도 Component가 있으면 빈으로 등록해줌
public @interface MyComponent {
}
