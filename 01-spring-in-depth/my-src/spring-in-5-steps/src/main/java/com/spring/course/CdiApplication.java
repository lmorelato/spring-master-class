package com.spring.course;

import com.spring.course.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);

    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(CdiApplication.class, args);
        var someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

        LOGGER.info("\tsomeCdiBusiness: {}", someCdiBusiness);
    }
}
