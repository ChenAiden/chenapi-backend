package com.yupi.project.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.project.model.dto.interfaceinfo.InterfaceInfoQueryRequest;
import com.yupi.project.model.dto.post.PostQueryRequest;
import com.yupi.project.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.project.model.entity.Post;

/**
* @author Aiden
* @description 针对表【interface_info(yuapi.`interface_info`)】的数据库操作Service
* @createDate 2024-05-15 23:08:34
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    /**
     * 获取查询条件
     *
     * @param interfaceInfoQueryRequest
     * @return
     */
    QueryWrapper<InterfaceInfo> getQueryWrapper(InterfaceInfoQueryRequest interfaceInfoQueryRequest);


}
