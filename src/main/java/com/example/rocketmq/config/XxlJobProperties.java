package com.example.rocketmq.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Author sgx
 * @Date 2024/5/26 16:40
 * @Description:
 */
@Configuration
@Data
public class XxlJobProperties {

    @Value("${xxl.job.admin.addresses}")
    private String adminAddresses;

    @Value("${xxl.job.accessToken}")
    private String accessToken;

    @Value("${xxl.job.executor.appname}")
    private String appname;

//    @Value("${xxl.job.admin.address}")
//    private String address;

//    @Value("${xxl.job.executor.ip}")
//    private String ip;

    @Value("${xxl.job.executor.port}")
    private int port;

    @Value("${xxl.job.executor.logpath}")
    private String logPath;

    @Value("${xxl.job.executor.logretentiondays}")
    private int logRetentionDays;
}
