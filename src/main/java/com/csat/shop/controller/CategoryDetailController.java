package com.csat.shop.controller;

import com.csat.shop.entity.CategoryDetail;
import com.csat.shop.service.CategoryDetailService;
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
@RequestMapping("/category")
public class CategoryDetailController {
    @Autowired
    CategoryDetailService categoryDetailService;

    @RequestMapping(value = "/getCategoryDetailData",method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<CategoryDetail> getCategoryDetailData(String typeNumber){
        return categoryDetailService.getCategoryDetailData(typeNumber);
    }
}
