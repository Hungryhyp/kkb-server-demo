package com.kkb.demo;

import com.kkb.hk.DemoApplication;
import com.kkb.hk.dao.HkBannerDao;
import com.kkb.hk.druid.DruidConfig;
import com.kkb.hk.druid.DruidProperties;
import com.kkb.hk.vo.request.banner.HkBannerRequest;
import com.kkb.hk.vo.response.banner.HkBannerResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Description
 * @Date 2021/9/25 9:27
 * @Created 30500
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
public class StoryTest {

    @Autowired
    DruidConfig druidConfig;

    @Autowired
    DruidProperties druidProperties;

    @Resource
    private HkBannerDao hkBannerDao;
    //测试数据库连接
    @Test
    public void test1() throws SQLException {

        System.out.println(druidConfig.masterDataSource(druidProperties).getConnection());
        List<HkBannerResponse> bannerResponses = hkBannerDao.qryList(new HkBannerRequest());
        for (HkBannerResponse bannerRespons : bannerResponses) {
            System.out.println(bannerRespons);
        }

        System.out.println("测试从feature_pyh 分支提交");
    }

}
