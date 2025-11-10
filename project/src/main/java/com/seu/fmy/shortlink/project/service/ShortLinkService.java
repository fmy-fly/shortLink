package com.seu.fmy.shortlink.project.service;

import com.seu.fmy.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import com.seu.fmy.shortlink.project.dto.resp.ShortLinkCreateRespDTO;

public interface ShortLinkService {
    ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam);
}
