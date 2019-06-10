package com.csat.shop.service;

import com.csat.shop.entity.CategoryDetail;

import java.util.List;

/**
 * @author lianghaolong
 * @date 2019/6/10 11:45
 */
public interface CategoryDetailService {
    /**
     * 返回目录列表
     * @param typeNumber
     * @return
     */
    List<CategoryDetail> getCategoryDetailData(String typeNumber);
}
