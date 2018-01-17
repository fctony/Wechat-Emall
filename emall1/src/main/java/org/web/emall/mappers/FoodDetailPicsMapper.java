package org.web.emall.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.web.emall.models.FoodDetailPics;
import org.web.emall.models.FoodDetailPicsExample;

public interface FoodDetailPicsMapper {

    List<FoodDetailPics> selectPicsByFoodId(Integer foodId);

    long countByExample(FoodDetailPicsExample example);

    int deleteByExample(FoodDetailPicsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FoodDetailPics record);

    int insertSelective(FoodDetailPics record);

    List<FoodDetailPics> selectByExampleWithBLOBs(FoodDetailPicsExample example);

    List<FoodDetailPics> selectByExample(FoodDetailPicsExample example);

    FoodDetailPics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FoodDetailPics record, @Param("example") FoodDetailPicsExample example);

    int updateByExampleWithBLOBs(@Param("record") FoodDetailPics record, @Param("example") FoodDetailPicsExample example);

    int updateByExample(@Param("record") FoodDetailPics record, @Param("example") FoodDetailPicsExample example);

    int updateByPrimaryKeySelective(FoodDetailPics record);

    int updateByPrimaryKeyWithBLOBs(FoodDetailPics record);

    int updateByPrimaryKey(FoodDetailPics record);
}