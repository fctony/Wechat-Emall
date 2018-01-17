package org.web.emall.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web.emall.ConfigModel;
import org.web.emall.ResponseModel;

import java.nio.charset.Charset;
import java.util.Date;

/**
 * 商城基础信息接口
 */
@RestController
public class BaseInfoController {

    @GetMapping("/config/get-value")
    public ResponseModel getBaseInfo(String key) {
        ConfigModel  cm = new ConfigModel(1,new Date(),0,key,"商城名称",new Date(),51
                ,"汤原味");
      return new ResponseModel(0,cm,"success");
    }
}
