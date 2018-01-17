package org.web.emall.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.web.emall.models.Banner;
import org.web.emall.models.BannerExample;

public interface BannerMapper {
    long countByExample(BannerExample example);

    int deleteByExample(BannerExample example);

    int insert(Banner record);

    int insertSelective(Banner record);

    List<Banner> selectByExample(BannerExample example);

    int updateByExampleSelective(@Param("record") Banner record, @Param("example") BannerExample example);

    int updateByExample(@Param("record") Banner record, @Param("example") BannerExample example);
}