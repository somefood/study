package me.somefood.tobyspring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloApiTest {

    @Test
    void helloApi() {
        // http localhost:8080/hello?name=Spring
        // HTTPie

        TestRestTemplate rest = new TestRestTemplate(); // 기존 RestTemplate은 에러는 예외 터트려서 좀 더 순수하게 사용하려면 이거 사용
        ResponseEntity<String> res =
                rest.getForEntity("http://localhost:8080/hello?name={name}", String.class, "Spring");

        // status 200
        // AssertJ는 스프링 initializer 프로젝트 만들면 들어오게 됨
        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);
        // header(content-type) text/plain
        assertThat(res.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE)).startsWith(MediaType.TEXT_PLAIN_VALUE);
        // body Hello Spring
        assertThat(res.getBody()).isEqualTo("*Hello Spring*");
    }

    @Test
    void failsHelloApi() {
        // http localhost:8080/hello?name=Spring
        // HTTPie

        TestRestTemplate rest = new TestRestTemplate(); // 기존 RestTemplate은 에러는 예외 터트려서 좀 더 순수하게 사용하려면 이거 사용
        ResponseEntity<String> res =
                rest.getForEntity("http://localhost:8080/hello?name=", String.class);

        // status 200
        // AssertJ는 스프링 initializer 프로젝트 만들면 들어오게 됨
        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
