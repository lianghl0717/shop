package com.csat.shop.dao;

import com.csat.shop.entity.CategoryDetail;
import com.csat.shop.entity.GoodsList;

import java.util.List;

/**
 * @author Jerry
 * @date 2019/6/10 10:45
 */
public interface GoodListDao {
    List<GoodsList> getGoodsListData(Integer start, Integer pageSize, String typeNumber);
}
