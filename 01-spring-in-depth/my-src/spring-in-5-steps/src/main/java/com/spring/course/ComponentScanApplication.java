package com.spring.course;

import com.spring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.componentscan")
public class ComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(ComponentScanApplication.class, args);
        var componentDao = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("\t{}", componentDao);
        LOGGER.info("\t\t{}", componentDao.getComponentJdbcConnection());
    }
}
