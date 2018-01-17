package org.web.emall.service;

import org.web.emall.models.Food;
import org.web.emall.models.FoodDetail;

public interface FoodDetailService extends BaseService<FoodDetail> {

    FoodDetail getFoodDetailByFoodId(Integer id);
}
