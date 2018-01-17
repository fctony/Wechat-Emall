package org.web.emall.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.web.emall.models.Reputation;
import org.web.emall.models.ReputationExample;

public interface ReputationMapper {
    long countByExample(ReputationExample example);

    int deleteByExample(ReputationExample example);

    int insert(Reputation record);

    int insertSelective(Reputation record);

    List<Reputation> selectByExample(ReputationExample example);

    int updateByExampleSelective(@Param("record") Reputation record, @Param("example") ReputationExample example);

    int updateByExample(@Param("record") Reputation record, @Param("example") ReputationExample example);
}