package com.csat.shop.controller;

import com.csat.shop.entity.GoodDetail;
import com.csat.shop.service.GoodDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lianghaolong
 * @date 2019/6/10 11:51
 */
@Controller
@RequestMapping("/details")
public class GoodDetailController {
    @Autowired
    GoodDetailService goodDetailService;

    @RequestMapping(value = "/getGoodDetails",method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<GoodDetail> getCategoryDetailData(Integer productId){
        return goodDetailService.getGoodDetails(productId);
    }
}
