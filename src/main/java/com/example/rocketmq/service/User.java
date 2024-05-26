package com.example.rocketmq.service;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author sgx
 * @Date 2024/5/23 14:29
 * @Description:
 */
@Data
@NoArgsConstructor
@ApiModel("用户")
public class User {
    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("年龄")
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public static User getUser() {
        // 这里可以根据实际情况获取用户信息，比如从数据库中查询或者从文件读取等
        // 这里仅作为示例，返回一个固定的用户对象
        return new User("John",30);
    }
}
