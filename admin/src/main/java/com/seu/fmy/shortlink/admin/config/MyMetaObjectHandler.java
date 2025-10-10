package com.seu.fmy.shortlink.admin.config;

/**
 * @ClassName：MyMetaObjectHandler
 * @Author: fmy
 * @Date: 2025/10/9 17:27
 * @Description:
 */


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        strictInsertFill(metaObject, "createTime", Date::new, Date.class);
        strictInsertFill(metaObject, "updateTime", Date::new, Date.class);
        strictInsertFill(metaObject, "delFlag", () -> 0, Integer.class);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        strictInsertFill(metaObject, "updateTime", Date::new, Date.class);
    }
}
