package com.seu.fmy.shortlink.admin.controller;

/**
 * @ClassName：UserRespDTO
 * @Author: fmy
 * @Date: 2025/9/30 19:12
 * @Description:
 */

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.seu.fmy.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;
import lombok.Data;

/**
 * 用户返回参数响应
 */
@Data
public class UserRespDTO {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;

    /**
     * 邮箱
     */
    private String mail;
}
