package com.kkb.hk.vo.response.banner;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @className HkBannerResponse
 * @description:  Banner返回对象
 * @author Allen
 * @date 2021/12/16 15:43
 */
@Data
public class HkBannerResponse implements Serializable {

    private static final long serialVersionUID = 1414495384060974671L;

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


}
