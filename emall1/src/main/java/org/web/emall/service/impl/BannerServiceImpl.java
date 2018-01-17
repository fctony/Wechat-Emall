package org.web.emall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.emall.mappers.BannerMapper;
import org.web.emall.models.Banner;
import org.web.emall.service.BannerService;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;


    @Override
    public List<Banner> getAll() {
        return  bannerMapper.selectByExample(null);
    }

    @Override
    public Banner findById(Integer id) {
        return null;
    }
}
