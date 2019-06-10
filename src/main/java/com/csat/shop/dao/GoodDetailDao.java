package com.csat.shop.dao;

import com.csat.shop.entity.GoodDetail;

import java.util.List;

/**
 * @author lianghaolong
 * @date 2019/6/10 17:20
 */
public interface GoodDetailDao {
    List<GoodDetail> getGoodDetails(Integer productId);
}
