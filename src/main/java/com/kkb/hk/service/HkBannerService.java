package com.kkb.hk.service;

import com.kkb.hk.entity.HkBanner;
import com.kkb.hk.entity.page.PageResult;
import com.kkb.hk.vo.request.banner.HkBannerRequest;
import com.kkb.hk.vo.response.banner.HkBannerResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @className HkBannerService
 * @description:  表(HkBanner)表服务接口
 * @author Allen
 * @date 2021/12/16 15:56
 */
public interface HkBannerService {

    /**
     * @description:  查询banner列表
     * @param: [hkBannerRequest]
     * @return: java.util.List<com.kkb.hk.vo.response.banner.HkBannerResponse>
     * @author Allen
     * @date: 2021/12/16 16:23
     */
    List<HkBannerResponse> qryList(HkBannerRequest hkBannerRequest);

    /**
     * @description:  查询banner列表分页查询
     * @param: [hkBannerRequest]
     * @return: com.kkb.hk.entity.page.PageResult
     * @author Allen
     * @date: 2021/12/16 16:23
     */
    PageResult qryListByPage(HkBannerRequest hkBannerRequest);

    /**
     * 添加一条banner记录
     * @param hkBanner
     * @return
     */
    Integer addBanner(HkBanner hkBanner);

    /**
     * 修改banner列表记录
     * @param hkBanner
     * @return
     */
    Integer updateBanner(HkBanner hkBanner);

    /**
     * 根据id删除banner列表记录
     * @param bannerId
     * @return
     */
    Integer deleteBannerById(Integer bannerId);
}
