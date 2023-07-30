package org.dailycodebuffer;

import org.dailycodebuffer.entity.Doctor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create a beans with the java configuration
 */
@Configuration
//@ComponentScan(basePackages = "org.dailycodebuffer")
public class BeanConfiguration {

    @Bean
    public Doctor doctor() {
        return new Doctor();
    }
}
