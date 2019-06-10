package com.csat.shop.dao;

import com.csat.shop.entity.GoodsList;
import com.csat.shop.entity.ShopDetails;

import java.util.List;

/**
 * @author Jerry
 * @date 2019/6/10 10:45
 */
public interface ShopDetailsDao {
    List<ShopDetails> getShopDetails(Integer productId);
}
