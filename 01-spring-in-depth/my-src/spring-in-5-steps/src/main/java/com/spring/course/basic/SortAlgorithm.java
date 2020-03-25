package com.spring.course.basic;

import org.springframework.stereotype.Component;

@Component
public interface SortAlgorithm {
    int[] sort(int[] numbers);
}
