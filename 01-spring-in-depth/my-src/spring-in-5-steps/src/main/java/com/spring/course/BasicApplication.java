package com.spring.course;

import com.spring.course.basic.BinarySearchImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class BasicApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BasicApplication.class, args);

        var binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

        log.info("{}", result);
    }
}
