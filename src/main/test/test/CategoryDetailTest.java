package test;

import com.csat.shop.dao.CategoryDetailDao;
import com.csat.shop.entity.CategoryDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author lianghaolong
 * @date 2019/6/10 11:13
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class CategoryDetailTest {
    @Autowired
    CategoryDetailDao categoryDetailDao;

    @Test
    public void test1(){
        List<CategoryDetail> list = categoryDetailDao.getCategoryDetailData("type1");
        System.out.println(list);
    }
}
