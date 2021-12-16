package com.kkb.hk.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.io.Serializable;

/**
 * banner表(HkBanner)实体类
 *
 * @author guoyuze
 * @since 2021-09-07 21:10:48
 */
@Data
public class HkBanner implements Serializable {
    private static final long serialVersionUID = 550294301675958811L;
    /**
     * 编号
     */

    private Integer bannerId;
    /**
     * 标题
     */
    private String title;
    /**
     * 描述
     */
    private String description;
    /**
     * 封面
     */
    private String image;
    /**
     * 跳转地址
     */
    private String url;
    /**
     * 状态;0=上架 1=下架 2=删除
     */
    private Integer status;
    /**
     * 顺序;越小越靠前
     */
    private Integer sort;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    private Date updatedTime;

}

