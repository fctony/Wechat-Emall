package org.web.emall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web.emall.ResponseModel;
import org.web.emall.models.Coupons;
import org.web.emall.service.CouponService;

import java.util.List;

/**
 * 优惠券接口
 */
@RestController
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping("/discounts/coupons")
    public ResponseModel getCoupons(String type) {
        List<Coupons> all = couponService.getAll();
        if(all != null) {
            return new ResponseModel(0,all,"success");
        }
        return ResponseModel.NotFound();
    }
}
