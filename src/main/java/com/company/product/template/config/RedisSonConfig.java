package com.company.product.template.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisSonConfig {

    /**
     * 注意集群的nodes.conf 通信地址需要改成外网
     * @return
     */
    @Bean
    public RedissonClient redisConfig() {
        Config config = new Config();
        config.useClusterServers()
                .addNodeAddress("redis://39.108.11.190:7001")
                .addNodeAddress("redis://39.108.11.190:7002")
                .addNodeAddress("redis://39.108.11.190:8001")
                .addNodeAddress("redis://39.108.11.190:8002")
                .addNodeAddress("redis://39.108.11.190:9001")
                .addNodeAddress("redis://39.108.11.190:9002")
                .setPassword("@kxtx5679192");

        RedissonClient redissonClient = Redisson.create(config);
        return redissonClient;
    }

}
