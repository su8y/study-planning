package com.studyplanning.analysis;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConfigTest {
    @Value("${my.screct.key}")
    private String myScrectKey;
    @Test
    void springCloudConfigServerBindingTest(){
        Assertions.assertThat(myScrectKey).isNotBlank();
    }
}
