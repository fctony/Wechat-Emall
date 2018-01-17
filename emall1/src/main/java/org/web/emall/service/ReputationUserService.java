package org.web.emall.service;

import org.web.emall.models.ReputationUser;

import java.util.List;

public interface ReputationUserService extends BaseService<ReputationUser>{

    List<ReputationUser> getReputationsByFoodId(Integer id);


}
