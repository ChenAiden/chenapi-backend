package com.yupi.project.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.project.common.ErrorCode;
import com.yupi.project.constant.CommonConstant;
import com.yupi.project.exception.BusinessException;
import com.yupi.project.exception.ThrowUtils;
import com.yupi.project.mapper.InterfaceInfoMapper;
import com.yupi.project.model.dto.interfaceinfo.InterfaceInfoQueryRequest;
import com.yupi.project.model.entity.InterfaceInfo;
import com.yupi.project.model.entity.Post;
import com.yupi.project.service.InterfaceInfoService;
import com.yupi.project.utils.SqlUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Aiden
 * @description 针对表【interface_info(yuapi.`interface_info`)】的数据库操作Service实现
 * @createDate 2024-05-15 23:08:34
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo> implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Long id = interfaceInfo.getId();
        String name = interfaceInfo.getName();
        String url = interfaceInfo.getUrl();
        String method = interfaceInfo.getMethod();
        String requestHeader = interfaceInfo.getRequestHeader();
        String responseHeader = interfaceInfo.getResponseHeader();


        // 创建时，参数不能为空
        if (add) {
            ThrowUtils.throwIf(StringUtils.isAnyBlank(name, url, method, requestHeader, responseHeader), ErrorCode.PARAMS_ERROR);
        }
        // 有参数则校验
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名字过长");
        }

    }

    @Override
    public QueryWrapper<InterfaceInfo> getQueryWrapper(InterfaceInfoQueryRequest interfaceInfoQueryRequest) {
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        if (interfaceInfoQueryRequest == null) {
            return queryWrapper;
        }
        String sortField = interfaceInfoQueryRequest.getSortField();
        String sortOrder = interfaceInfoQueryRequest.getSortOrder();
        String description = interfaceInfoQueryRequest.getDescription();
        interfaceInfoQueryRequest.setDescription(null);

        queryWrapper.like(StringUtils.isNotBlank(description), "description", description);
        queryWrapper.orderBy(SqlUtils.validSortField(sortField), sortOrder.equals(CommonConstant.SORT_ORDER_ASC),
                sortField);
        return queryWrapper;
    }


}




