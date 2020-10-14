package uk.ac.ox.ctsu.arts.translationservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Value( "${jdbc.driver}" )
    private String driverClass;
    @Value( "${jdbc.url}" )
    private String url;
    @Value( "${jdbc.username}" )
    private String username;
    @Value( "${jdbc.password}" )
    private String password;

    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
            .driverClassName(driverClass)
            .url(url)
            .username(username)
            .password(password)
            .build();
    }
}
