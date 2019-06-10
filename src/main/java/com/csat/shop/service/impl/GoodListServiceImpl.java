package com.csat.shop.service.impl;

import com.csat.shop.dao.CategoryDetailDao;
import com.csat.shop.dao.GoodListDao;
import com.csat.shop.entity.CategoryDetail;
import com.csat.shop.entity.GoodsList;
import com.csat.shop.service.CategoryDetailService;
import com.csat.shop.service.GoodListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lianghaolong
 * @date 2019/6/10 11:47
 */
@Service
public class GoodListServiceImpl implements GoodListService {

    @Autowired
    GoodListDao goodListDao;

    @Override
    public List<GoodsList> getGoodsListData(Integer pageNum, Integer pageSize, String typeNumber) {
        return goodListDao.getGoodsListData((pageNum-1)*pageSize,pageSize,typeNumber);
    }

}
