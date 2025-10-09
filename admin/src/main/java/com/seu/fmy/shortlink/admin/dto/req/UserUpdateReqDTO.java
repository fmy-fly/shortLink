package com.seu.fmy.shortlink.admin.dto.req;

/**
 * @ClassName：UserUpdateReqDTO
 * @Author: fmy
 * @Date: 2025/10/9 17:16
 * @Description:
 */

import lombok.Data;

/**
 * 用户注册请求参数
 */
@Data
public class UserUpdateReqDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

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
