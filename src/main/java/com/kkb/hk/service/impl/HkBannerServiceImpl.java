package com.kkb.hk.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.hk.dao.HkBannerDao;
import com.kkb.hk.entity.HkBanner;
import com.kkb.hk.entity.page.PageResult;
import com.kkb.hk.service.HkBannerService;
import com.kkb.hk.utils.PageUtils;
import com.kkb.hk.utils.StringUtils;
import com.kkb.hk.vo.request.banner.HkBannerRequest;
import com.kkb.hk.vo.response.banner.HkBannerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @className HkBannerServiceImpl
 * @description:  banner表(HkBanner)表服务实现类
 * @author Allen
 * @date 2021/12/16 15:57
 */
@Service("hkBannerService")
@Slf4j
public class HkBannerServiceImpl implements HkBannerService {
    @Resource
    private HkBannerDao hkBannerDao;

    @Resource
    private RedisTemplate<String, List<HkBannerResponse>> redisTemplate;



    /**
     * @description:  查询banner列表
     * @param: [hkBannerRequest]
     * @return: java.util.List<com.kkb.hk.vo.response.banner.HkBannerResponse>
     * @author Allen
     * @date: 2021/12/16 19:29
     */
    @Override
    public List<HkBannerResponse> qryList(HkBannerRequest hkBannerRequest) {
        //此处代码需要先从redis中获取，获取不到则取查数据库
        //获取当前请求的title参数
        String requestTitle = hkBannerRequest.getTitle();
        ValueOperations<String, List<HkBannerResponse>> operations = redisTemplate.opsForValue();

        if (requestTitle != null){
            //1.若title不为空
            // 获取缓存数据
            List<HkBannerResponse> list = operations.get(requestTitle);
            if(null==list){
                log.info("缓存中数据不存在");
                //缓存中没有数据，查询数据库
                list = hkBannerDao.qryList(hkBannerRequest);
                //此处代码需要把查出来的结果set redis缓存
                operations.set(requestTitle, list);
                return list;
                //this.redisTemplate.opsForList().leftPush(requestTitle, list);
            }
            log.info("从缓存中获取的数据");
            log.info(JSON.toJSONString(list));
            return list;

        }else {
            //2.若title为空，查询所有
            // 获取缓存数据
            List<HkBannerResponse> list = operations.get("allBanner");
            if(null==list){
                log.info("缓存中数据不存在");
                //缓存中没有数据，查询数据库
                list = hkBannerDao.qryList(hkBannerRequest);
                //此处代码需要把查出来的结果set redis缓存
                operations.set("allBanner", list);
                return list;
                //this.redisTemplate.opsForList().leftPush(requestTitle, list);
            }
            log.info("从缓存中获取的数据");
            log.info(JSON.toJSONString(list));
            return list;

        }


    }

    /**
     * @description:  查询banner列表分页查询
     * @param: [hkBannerRequest]
     * @return: com.kkb.hk.entity.page.PageResult
     * @author Allen
     * @date: 2021/12/16 17:48
     */
    @Override
    public PageResult qryListByPage(HkBannerRequest hkBannerRequest) {
        int pageNum = hkBannerRequest.getPageNum();
        int pageSize = hkBannerRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<HkBannerResponse> responseList = this.hkBannerDao.qryListByPage(hkBannerRequest);
        return PageUtils.getPageResult(new PageInfo<HkBannerResponse>(responseList));
    }

    /**
     * 添加一条banner记录
     * @param hkBanner
     * @return
     */
    @Override
    public Integer addBanner(HkBanner hkBanner) {
        return hkBannerDao.addBanner(hkBanner);
    }

    /**
     * 修改banner列表记录
     * @param hkBanner
     * @return
     */
    @Override
    public Integer updateBanner(HkBanner hkBanner) {
        return hkBannerDao.updateBanner(hkBanner);
    }

    /**
     * 根据id删除banner列表记录
     * @param bannerId
     * @return
     */
    @Override
    public Integer deleteBannerById(Integer bannerId) {
        return hkBannerDao.deleteBannerById(bannerId);
    }

}
