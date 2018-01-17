package org.web.emall.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.web.emall.models.Food;
import org.web.emall.models.FoodExample;

public interface FoodMapper {

    Food selectFoodById(Integer foodId);

    long countByExample(FoodExample example);

    int deleteByExample(FoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Food record);

    int insertSelective(Food record);

    List<Food> selectByExample(FoodExample example);

    Food selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);
}