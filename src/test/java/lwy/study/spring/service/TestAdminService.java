package lwy.study.spring.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdminService {

    ApplicationContext applicationContext;

    IAdminService adminService;

    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        adminService = applicationContext.getBean(IAdminService.class);
    }

    @Test
    public void testLogin(){
        Boolean result = adminService.login("itheima@itcast.cn", "123");
        System.out.println(result);
    }
}
