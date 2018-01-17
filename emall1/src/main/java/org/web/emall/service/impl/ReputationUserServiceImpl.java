package org.web.emall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.emall.mappers.ReputaionUserMapper;
import org.web.emall.models.ReputationUser;
import org.web.emall.service.ReputationUserService;

import java.util.List;

@Service
public class ReputationUserServiceImpl implements ReputationUserService {

    @Autowired
    private ReputaionUserMapper reputaionUserMapper;


    @Override
    public List<ReputationUser> getAll() {
        return null;
    }

    @Override
    public ReputationUser findById(Integer id) {
        return null;
    }

    @Override
    public List<ReputationUser> getReputationsByFoodId(Integer id) {
        return reputaionUserMapper.selectReputationWithUserByFoodId(id);
    }
}
