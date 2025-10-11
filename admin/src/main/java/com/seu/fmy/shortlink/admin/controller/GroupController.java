package com.seu.fmy.shortlink.admin.controller;


import com.seu.fmy.shortlink.admin.common.result.Result;
import com.seu.fmy.shortlink.admin.common.result.Results;
import com.seu.fmy.shortlink.admin.dto.req.ShortLinkGroupSaveReqDTO;
import com.seu.fmy.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接分组控制层
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @PostMapping("/api/short-link/v1/group")
    public Result<Void> save(@RequestBody ShortLinkGroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }
}
