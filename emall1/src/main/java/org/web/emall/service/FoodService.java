package org.web.emall.service;

import org.web.emall.models.Food;

import java.util.List;

/**
 *
 */
public interface FoodService extends BaseService<Food> {

    List<Food> getFoodsByCategotyId(Integer categoryId);

}
