package com.example.rocketmq.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author sgx
 * @Date 2024/5/25 22:20
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private String name;
    private String url;
    private String email;
}
