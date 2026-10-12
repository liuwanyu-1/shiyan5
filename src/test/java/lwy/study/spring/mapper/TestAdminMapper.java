package lwy.study.spring.mapper;

import lwy.study.spring.vo.Admin;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdminMapper {

    ApplicationContext applicationContext;

    AdminMapper adminMapper;

    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        adminMapper = applicationContext.getBean(AdminMapper.class);
    }

    @Test
    public void TestSelectByEmail(){
        Admin admin = adminMapper.selectByEmail("itheima@itcast.cn");
        System.out.println(admin);
    }
}
