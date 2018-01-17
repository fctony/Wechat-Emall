package org.web.emall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web.emall.ResponseModel;
import org.web.emall.models.Food;
import org.web.emall.service.FoodService;

import java.util.List;

/**
 * 汤接口
 */
@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;


    @GetMapping("/foods/list")
    public ResponseModel getAllFood(Integer categoryId) {

        if(categoryId != null) {
            List<Food> foodsByCategotyId = foodService.getFoodsByCategotyId(categoryId);
            if(foodsByCategotyId != null) {
                return new ResponseModel(0,foodsByCategotyId,"success");
            }
        } else {
            List<Food> foods = foodService.getAll();
            if(foods != null) {
                return new ResponseModel(0,foods,"success");
            }
        }
        return ResponseModel.NotFound();
    }


}
