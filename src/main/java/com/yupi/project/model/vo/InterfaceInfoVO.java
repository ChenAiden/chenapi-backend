package com.yupi.project.model.vo;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.yupi.project.model.entity.Post;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 帖子视图
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Data
public class InterfaceInfoVO implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 接口名称
     */
    private String name;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 接口状态（0：关闭，1：开始）
     */
    private Integer status;

    /**
     * 描述
     */
    private String description;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 创建人
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除(0-未删, 1-已删)
     */
    private Integer isDeleted;

//    /**
//     * 包装类转对象
//     *
//     * @param postVO
//     * @return
//     */
//    public static Post voToObj(InterfaceInfoVO postVO) {
//        if (postVO == null) {
//            return null;
//        }
//        Post post = new Post();
//        BeanUtils.copyProperties(postVO, post);
//        List<String> tagList = postVO.getTagList();
//        post.setTags(JSONUtil.toJsonStr(tagList));
//        return post;
//    }
//
//    /**
//     * 对象转包装类
//     *
//     * @param post
//     * @return
//     */
//    public static InterfaceInfoVO objToVo(Post post) {
//        if (post == null) {
//            return null;
//        }
//        InterfaceInfoVO postVO = new InterfaceInfoVO();
//        BeanUtils.copyProperties(post, postVO);
//        postVO.setTagList(JSONUtil.toList(post.getTags(), String.class));
//        return postVO;
//    }
}
