package com.spring.course;

import com.spring.course.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);

    public static void main(String[] args) {
        var applicationContext = SpringApplication.run(SpringComponentScanApplication.class, args);
        var personDao = applicationContext.getBean(PersonDAO.class);
        var personDao2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("\tpersonDao: {}", personDao);
        LOGGER.info("\t\t{}", personDao.getJdbcConnection());

        LOGGER.info("\tpersonDao2: {}", personDao2);
        LOGGER.info("\t\t{}", personDao2.getJdbcConnection());
    }
}
