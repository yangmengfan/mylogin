package cn.myplay;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Auther: ymfa
 * @Date: 2019/5/22 18:16
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    //@Autowired
    //private JobMapper jobMapper;

    @Test
    public void testSelect() {
        //System.out.println(("----- selectAll method test ------"));
        //List<Job> userList = jobMapper.selectList(null);
        //
        //Assert.assertEquals(1, userList.size());
        //userList.forEach(System.out::println);
    }

}
