package com.spring.course;

import com.spring.course.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBasicApplication.class, args);

        var binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

        System.out.println("\n##################");
        System.out.println(result);
        System.out.println("##################\n");
    }
}
