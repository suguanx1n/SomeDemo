package com.example.rocketmq.config;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author sgx
 * @Date 2024/5/26 16:43
 * @Description:
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class XxlJobTest {

    @XxlJob("xxlJobTest")
    public ReturnT<String> xxlJobTest(String date) {
        log.info("---------xxlJobTest定时任务执行成功--------");
        return ReturnT.SUCCESS;
    }

}

