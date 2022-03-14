package com.kkb.hk.dao;

import com.kkb.hk.entity.HkBanner;
import com.kkb.hk.vo.request.banner.HkBannerRequest;
import com.kkb.hk.vo.response.banner.HkBannerResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @className HkBannerDao
 * @description:  表(HkBanner)表数据库访问层
 * @author Allen
 * @date 2021/12/16 15:49
 */
@Mapper
public interface HkBannerDao {

    /**
     * @description:查询banner列表
     * @param: [hkBannerRequest]
     * @return: java.util.List<com.kkb.hk.vo.response.banner.HkBannerResponse>
     * @author Allen
     * @date: 2021/12/16 16:25
     */
    List<HkBannerResponse> qryList(HkBannerRequest hkBannerRequest);

    /**
     * @description:查询banner列表分页查询
     * @param: [hkBannerRequest]
     * @return: java.util.List<com.kkb.hk.vo.response.banner.HkBannerResponse>
     * @author Allen
     * @date: 2021/12/16 16:27
     */
    List<HkBannerResponse> qryListByPage(HkBannerRequest hkBannerRequest);

    /**
     * 数据库添加一条banner记录
     * @param hkBanner
     * @return
     */
    Integer addBanner(HkBanner hkBanner);

    /**
     * 修改一条banner记录
     * @param hkBanner
     * @return
     */
    Integer updateBanner(HkBanner hkBanner);

    /**
     * 按id删除一条记录
     * @param bannerId
     * @return
     */
    Integer deleteBannerById(Integer bannerId);
}

