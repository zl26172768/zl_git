package com.db.test;

import com.db.mapper.AppUserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 13-8-27
 * Time: 下午3:22
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:application-*.xml");
        AppUserMapper mapper= (AppUserMapper) applicationContext.getBean("appUserMapper");
        System.out.println(mapper+"--成功");
     /*   AppUser appUser=new AppUser();
        appUser.setId(121);
        appUser.setName("李四");
        mapper.insert(appUser);*/

          //  System.out.println(((BasicDataSource)applicationContext.getBean("dataSource")).getConnection());


    }

}
