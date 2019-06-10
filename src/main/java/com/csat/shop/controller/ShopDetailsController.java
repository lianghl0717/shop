package com.csat.shop.controller;

import com.csat.shop.entity.GoodsList;
import com.csat.shop.entity.ShopDetails;
import com.csat.shop.service.GoodListService;
import com.csat.shop.service.ShopDetailsService;
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
public class ShopDetailsController {
    @Autowired
    ShopDetailsService shopDetailsService;

    @RequestMapping(value = "/getShopDetails",method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<ShopDetails> getShopDetails(Integer productId){
        return shopDetailsService.getShopDetails(productId);
    }
}
