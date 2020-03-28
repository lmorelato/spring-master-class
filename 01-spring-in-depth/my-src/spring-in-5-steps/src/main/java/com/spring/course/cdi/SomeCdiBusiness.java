package com.spring.course.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

    @Inject
    private SomeCdiDao someCdiDao;
}
