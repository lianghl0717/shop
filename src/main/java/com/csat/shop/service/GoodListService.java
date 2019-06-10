package com.csat.shop.service;

import com.csat.shop.entity.CategoryDetail;
import com.csat.shop.entity.GoodsList;

import java.util.List;

/**
 * @author lianghaolong
 * @date 2019/6/10 11:45
 */
public interface GoodListService {
    /**
     * 返回目录列表
     * @param typeNumber
     * @return
     */
    List<GoodsList> getGoodsListData(Integer pageNum, Integer pageSize, String typeNumber);
}
