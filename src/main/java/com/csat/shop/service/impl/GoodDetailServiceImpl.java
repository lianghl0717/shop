package com.csat.shop.service.impl;

import com.csat.shop.dao.GoodDetailDao;
import com.csat.shop.entity.GoodDetail;
import com.csat.shop.service.GoodDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lianghaolong
 * @date 2019/6/10 11:47
 */
@Service
public class GoodDetailServiceImpl implements GoodDetailService {

    @Autowired
    GoodDetailDao goodDetailDao;

    @Override
    public List<GoodDetail> getGoodDetails(Integer productId) {
        return goodDetailDao.getGoodDetails(productId);
    }
}
