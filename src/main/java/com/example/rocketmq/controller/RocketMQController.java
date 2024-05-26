package com.example.rocketmq.controller;

import com.example.rocketmq.service.MQProducerService;

import com.example.rocketmq.service.User;
import io.swagger.annotations.Api;
import org.apache.rocketmq.client.producer.SendResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author sgx
 * @Date 2024/5/23 14:27
 * @Description:
 */
@Api(tags = "RocketMq测试")
@RestController
@RequestMapping("/rocketMq")
public class RocketMQController {

    @Autowired
    private MQProducerService mqProducerService;


    @GetMapping("/send")
    public void send() {
        User user = User.getUser();
        mqProducerService.send(user);
    }

//    @GetMapping("/sendTag")
//    public Result<SendResult> sendTag() {
//        SendResult sendResult = mqProducerService.sendTagMsg("带有tag的字符消息");
//        return Result.success(sendResult);
//    }

    @GetMapping("/sendTag")
    public String sendTag() {
        SendResult sendResult = mqProducerService.sendTagMsg("带有tag的字符消息");
        return sendResult.toString();
    }

}
