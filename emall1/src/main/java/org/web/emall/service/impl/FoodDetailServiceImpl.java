package org.web.emall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.emall.mappers.FoodDetailMapper;
import org.web.emall.models.FoodDetail;
import org.web.emall.service.FoodDetailService;

import java.util.List;

@Service
public class FoodDetailServiceImpl implements FoodDetailService {

    @Autowired
    private FoodDetailMapper foodDetailMapper;

    @Override
    public List<FoodDetail> getAll() {
        return null;
    }

    @Override
    public FoodDetail findById(Integer id) {
        return null;
    }


    @Override
    public FoodDetail getFoodDetailByFoodId(Integer id) {
        return foodDetailMapper.selectFoodDetailByFoodId(id);
    }
}
