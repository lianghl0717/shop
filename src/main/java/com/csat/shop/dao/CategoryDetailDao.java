package com.csat.shop.dao;

import com.csat.shop.entity.CategoryDetail;

import java.util.List;

/**
 * @author lianghaolong
 * @date 2019/6/10 10:45
 */
public interface CategoryDetailDao {
    List<CategoryDetail> getCategoryDetailData(String typeNumber);
}
