package com.company.product.template.config;


import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

  /*  @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public HikariConfig hikariConfig(){
        return new HikariConfig();
    }

    @Bean
    public DataSource dataSource(@Autowired HikariConfig hikariConfig){
        return new HikariDataSource(hikariConfig);
    }*/
}
