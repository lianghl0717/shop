package com.csat.shop.service;


import com.csat.shop.entity.ShopDetails;

import java.util.List;

/**
 * @author Jerry
 * @date 2019/6/10 11:45
 */
public interface ShopDetailsService {
    /**
     * 返回目录列表
     * @param productId
     * @return
     */
    List<ShopDetails> getShopDetails(Integer productId);
}
