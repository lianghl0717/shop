package com.csat.shop.service.impl;

import com.csat.shop.dao.CategoryDetailDao;
import com.csat.shop.entity.CategoryDetail;
import com.csat.shop.service.CategoryDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lianghaolong
 * @date 2019/6/10 11:47
 */
@Service
public class CategoryDetailServiceImpl implements CategoryDetailService {

    @Autowired
    CategoryDetailDao categoryDetailDao;

    @Override
    public List<CategoryDetail> getCategoryDetailData(String typeNumber) {
        return categoryDetailDao.getCategoryDetailData(typeNumber);
    }
}
