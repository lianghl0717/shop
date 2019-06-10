package com.csat.shop.controller;

import com.csat.shop.entity.GoodsList;
import com.csat.shop.service.GoodListService;
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
@RequestMapping("/goodsList")
public class GoodListController {
    @Autowired
    GoodListService goodListService;

    @RequestMapping(value = "/getGoodsListData",method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<GoodsList> getGoodsListData(Integer pageNum, Integer pageSize, String typeNumber){
        return goodListService.getGoodsListData(pageNum,pageSize,typeNumber);
    }
}
