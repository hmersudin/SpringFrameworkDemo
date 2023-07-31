package org.dailycodebuffer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Create a beans with the java configuration
 */
@Configuration
@ComponentScan(basePackages = "org.dailycodebuffer")
@EnableAspectJAutoProxy
public class BeanConfiguration {
}
