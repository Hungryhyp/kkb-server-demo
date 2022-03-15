package com.kkb.hk.controller;

import com.kkb.hk.entity.HkBanner;
import com.kkb.hk.service.HkBannerService;
import com.kkb.hk.utils.ReqResultUtil;
import com.kkb.hk.vo.request.banner.HkBannerRequest;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @className HkBannerController
 * @description:banner接口层
 * @author Allen
 * @date 2021/12/16 15:48
 */
@RestController
@RequestMapping("hkBanner")
@Slf4j
public class HkBannerController {


    @Resource
    private HkBannerService hkBannerService;


    /**
     * @description:  查询banner列表
     * @param: []
     * @return: org.springframework.http.ResponseEntity<java.lang.String>
     * @author Allen
     * @date: 2021/12/16 15:48
     */
    @RequestMapping(value = "/qryList", method = RequestMethod.POST)
    public ResponseEntity<String> qryList(HkBannerRequest hkBannerRequest) {
        log.info("进入banner列表接口");
        log.info("开始");
        return ReqResultUtil.genSuccessResultResponse(hkBannerService.qryList(hkBannerRequest));

    }

    /**
     * @description:分页查询banner列表
     * @param: [hkBannerRequest]
     * @return: org.springframework.http.ResponseEntity<java.lang.String>
     * @author Allen
     * @date: 2021/12/16 18:53
     */
    @RequestMapping(value = "/qryListByPage", method = RequestMethod.POST)
    public ResponseEntity<String> qryListByPage(HkBannerRequest hkBannerRequest) {
        log.info("进入banner列表接口");
        return ReqResultUtil.genSuccessResultResponse(hkBannerService.qryListByPage(hkBannerRequest));
    }


    /**
     * 添加banner列表记录
     * @param hkBanner
     * @return
     */
    @RequestMapping(value = "/addBanner",method = RequestMethod.POST)
    public ResponseEntity<String> addBanner(HkBanner hkBanner){
        log.info("进入banner添加接口");
        hkBanner.setStatus(0);//设置默认状态为0
        hkBanner.setSort(1); //sort不能为空，暂用于测试
        hkBanner.setCreatedBy("pyh");//此处应当从session中获取用户的信息作为记录的创建者
        hkBanner.setCreatedTime(new Date(System.currentTimeMillis()));
        //返回影响行数作为判断是否操作成功的依据
        Integer addBannerCount = hkBannerService.addBanner(hkBanner);
        if (addBannerCount >= 1){
            //添加成功，返回成功信息
            return ReqResultUtil.genSuccessResultResponse();
        }else {
            //添加失败，返回系统异常
            return ReqResultUtil.genFailResultResponse();
        }

    }

    /**
     * 修改banner列表记录
     * @param hkBanner
     * @return
     */
    @RequestMapping(value = "/updateBanner",method = RequestMethod.PUT)
    public ResponseEntity<String> updateBanner(HkBanner hkBanner){
        log.info("进入banner修改接口");
        hkBanner.setStatus(0);//设置默认状态为0
        hkBanner.setSort(1); //sort不能为空，暂用于测试
        hkBanner.setUpdatedBy("pyh");//此处应当从session中获取用户的信息作为记录的修改者
        hkBanner.setUpdatedTime(new Date(System.currentTimeMillis()));
        Integer updateBannerCount = hkBannerService.updateBanner(hkBanner);
        if (updateBannerCount >= 1){
            //添加成功，返回成功信息
            return ReqResultUtil.genSuccessResultResponse();
        }else {
            //添加失败，返回系统异常
            return ReqResultUtil.genFailResultResponse();
        }
    }

    /**
     * 根据id删除banner列表记录
     * @param bannerId
     * @return
     */
    @RequestMapping(value = "/deleteBannerById",method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteBannerById(Integer bannerId){
        log.info("进入删除接口");
        Integer deleteBannerCount = hkBannerService.deleteBannerById(bannerId);
        if (deleteBannerCount >= 1){
            //添加成功，返回成功信息
            return ReqResultUtil.genSuccessResultResponse();
        }else {
            //添加失败，返回系统异常
            return ReqResultUtil.genFailResultResponse();
        }
    }

}

