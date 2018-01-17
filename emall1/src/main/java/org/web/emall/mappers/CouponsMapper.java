package org.web.emall.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.web.emall.models.Coupons;
import org.web.emall.models.CouponsExample;

public interface CouponsMapper {
    long countByExample(CouponsExample example);

    int deleteByExample(CouponsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Coupons record);

    int insertSelective(Coupons record);

    List<Coupons> selectByExample(CouponsExample example);

    Coupons selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Coupons record, @Param("example") CouponsExample example);

    int updateByExample(@Param("record") Coupons record, @Param("example") CouponsExample example);

    int updateByPrimaryKeySelective(Coupons record);

    int updateByPrimaryKey(Coupons record);
}