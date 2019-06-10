package com.csat.shop.service.impl;

import com.csat.shop.dao.GoodListDao;
import com.csat.shop.dao.ShopDetailsDao;
import com.csat.shop.entity.GoodsList;
import com.csat.shop.entity.ShopDetails;
import com.csat.shop.service.GoodListService;
import com.csat.shop.service.ShopDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lianghaolong
 * @date 2019/6/10 11:47
 */
@Service
public class ShopDetailsServiceImpl implements ShopDetailsService {

    @Autowired
    ShopDetailsDao shopDetailsDao;

    @Override
    public List<ShopDetails> getShopDetails(Integer productId) {
        return shopDetailsDao.getShopDetails(productId);
    }
}
