package com.author.kickstart.configuration;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile({“dev”, “qa”})
public class NonProdDatabaseConfig {
//some code
@PreDestroy
public void destroy() {
connection.close();
}
}