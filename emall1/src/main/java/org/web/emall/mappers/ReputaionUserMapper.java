package org.web.emall.mappers;

import org.web.emall.models.Reputation;
import org.web.emall.models.ReputationUser;

import java.util.List;

public interface ReputaionUserMapper {

    List<ReputationUser> selectReputationWithUserByFoodId(int foodId);

}
