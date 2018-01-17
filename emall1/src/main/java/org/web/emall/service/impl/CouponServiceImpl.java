package org.web.emall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.emall.mappers.CouponsMapper;
import org.web.emall.models.Coupons;
import org.web.emall.service.CouponService;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponsMapper couponsMapper;

    @Override
    public List<Coupons> getAll() {
        return couponsMapper.selectByExample(null);
    }

    @Override
    public Coupons findById(Integer id) {
        return null;
    }
}
