package org.web.emall.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.web.emall.models.FoodDetail;
import org.web.emall.models.FoodDetailExample;

public interface FoodDetailMapper {

    FoodDetail selectFoodDetailByFoodId(Integer foodId);

    long countByExample(FoodDetailExample example);

    int deleteByExample(FoodDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FoodDetail record);

    int insertSelective(FoodDetail record);

    List<FoodDetail> selectByExampleWithBLOBs(FoodDetailExample example);

    List<FoodDetail> selectByExample(FoodDetailExample example);

    FoodDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FoodDetail record, @Param("example") FoodDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") FoodDetail record, @Param("example") FoodDetailExample example);

    int updateByExample(@Param("record") FoodDetail record, @Param("example") FoodDetailExample example);

    int updateByPrimaryKeySelective(FoodDetail record);

    int updateByPrimaryKeyWithBLOBs(FoodDetail record);

    int updateByPrimaryKey(FoodDetail record);
}