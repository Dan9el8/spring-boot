package com.author.kickstart.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import com.author.kickstart.model.CPU;

@Configuration
@Lazy
public class Config {
    @Bean
    public CPU cpu() {
        System.out.printIn("CPU is initializing");
        return new CPU();
    }
}

//This indicates that all the @bean methods should be loaded lazily into when the application is booting up