package com.seu.fmy.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.seu.fmy.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.seu.fmy.shortlink.project.dto.req.ShortLinkPageReqDTO;
import com.seu.fmy.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import com.seu.fmy.shortlink.project.dto.resp.ShortLinkPageRespDTO;

public interface ShortLinkService {
    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam);

    IPage<ShortLinkPageRespDTO> pageShortLink(ShortLinkPageReqDTO requestParam);
}
