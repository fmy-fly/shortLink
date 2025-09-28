package com.seu.fmy.shortlink.admin.controller;


import com.seu.fmy.shortlink.admin.common.result.Result;
import com.seu.fmy.shortlink.admin.common.result.Results;
import com.seu.fmy.shortlink.admin.dto.resp.UserRespDTO;
import com.seu.fmy.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**co
 * 用户管理控制层
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }
}
