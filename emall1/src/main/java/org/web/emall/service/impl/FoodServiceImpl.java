package org.web.emall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.emall.mappers.FoodMapper;
import org.web.emall.models.Food;
import org.web.emall.models.FoodExample;
import org.web.emall.service.FoodService;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<Food> getAll() {
        return foodMapper.selectByExample(null);
    }

    @Override
    public Food findById(Integer id) {
        return null;
    }

    @Override
    public List<Food> getFoodsByCategotyId(Integer categoryId) {
        FoodExample example = new FoodExample();
        FoodExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(categoryId);
        return foodMapper.selectByExample(example);
    }
}
