package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 자바의 main()메서드와 같은 역할. 스프링 부트가 시작됨
@EnableJpaAuditing //자동 업데이트
@SpringBootApplication // 스프링부트 사용에 필요한 기본 설정을 해줌
public class MyBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}
