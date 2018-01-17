package org.web.emall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web.emall.ResponseModel;
import org.web.emall.models.ReputationUser;
import org.web.emall.service.ReputationUserService;

import java.util.List;

/**
 * 汤-用户评论接口
 */
@RestController
public class ReputationUserController {

    @Autowired
    private ReputationUserService reputationUserService;

    @GetMapping("/food/reputation")
    public ResponseModel getReputationsByFoodId(Integer goodsId) {
        if(goodsId == null) {
            return ResponseModel.NotFound();
        }
        List<ReputationUser> reputations = reputationUserService.getReputationsByFoodId(goodsId);
        if(reputations != null) {
            return new ResponseModel(0,reputations,"success");
        }
        return ResponseModel.NotFound();
    }

}
