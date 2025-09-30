package com.seu.fmy.shortlink.admin.controller;

/**
 * @ClassName：UserActualRespDTO
 * @Author: fmy
 * @Date: 2025/9/30 19:11
 * @Description:
 */

import lombok.Data;

/**
 * 用户返回参数响应
 */
@Data
public class UserActualRespDTO {

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
    private String phone;

    /**
     * 邮箱
     */
    private String mail;
}
