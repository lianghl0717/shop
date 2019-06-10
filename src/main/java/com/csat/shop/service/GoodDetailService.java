package com.csat.shop.service;


import com.csat.shop.entity.GoodDetail;

import java.util.List;

/**
 * @author lianghaolong
 * @date 2019/6/10 11:45
 */
public interface GoodDetailService {
    /**
     * 返回目录列表
     * @param productId
     * @return
     */
    List<GoodDetail> getGoodDetails(Integer productId);
}
