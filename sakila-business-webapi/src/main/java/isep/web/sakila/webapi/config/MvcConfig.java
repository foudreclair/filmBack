package isep.web.sakila.webapi.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import isep.web.sakila.webapi.config.PersisstanceConfig;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "isep.web.sakila.webapi" })
@EntityScan("isep.web.sakila.jpa.entities")
@EnableJpaRepositories("isep.web.sakila.dao.repositories")
public class MvcConfig implements WebMvcConfigurer {

}
