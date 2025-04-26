package com.kickstart.configuration;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = MyConfiguration.class)
@TestPropertySource(locations = "/MyConfigurationTest.properties")
public class MyConfigurationTest {
    @Autowired
    MyConfiguration configuration;

    @Testpublic void testValues() {
        String[] output = configuration.getComplexValues();
        assertThat(output).contains("6","7","9","10");
    }
}