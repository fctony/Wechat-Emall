package org.web.emall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web.emall.ResponseModel;
import org.web.emall.models.FoodDetail;
import org.web.emall.service.FoodDetailService;

/**
 * 汤详细信息接口
 */
@RestController
public class FoodDetailController {

    @Autowired
    private FoodDetailService foodDetailService;

    @GetMapping("/food/detail")
    public ResponseModel getFoodDetailByFoodId(Integer id) {
        if (id == null) {
            return ResponseModel.NotFound();
        }
        FoodDetail foodDetailByFoodId = foodDetailService.getFoodDetailByFoodId(id);
        if (foodDetailByFoodId != null) {
            return new ResponseModel(0, foodDetailByFoodId, "success");
        }
        return ResponseModel.NotFound();
    }
}
