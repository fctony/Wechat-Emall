package org.web.emall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web.emall.ResponseModel;
import org.web.emall.models.Banner;
import org.web.emall.service.BannerService;

import java.util.List;

/**
 * 轮播图接口
 */
@RestController
public class BannerController {

    @Autowired
    private BannerService bannerService;


    @GetMapping("/banner/list")
    public ResponseModel getBannerList(String key) {
        List<Banner> banners = bannerService.getAll();
        if(banners != null) {
            return new ResponseModel(0,banners,"success");
        }
        return ResponseModel.NotFound();
    }

}
