package com.db.business.impl;

import com.db.business.ITestBusniess;
import com.db.entity.AppAddress;
import com.db.entity.AppUser;
import com.db.service.IAppAddressService;
import com.db.service.IAppUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 13-8-27
 * Time: 下午12:15
 * To change this template use File | Settings | File Templates.
 */
@Service
public class TestBusiness implements ITestBusniess {

    @Resource
    private IAppAddressService appAddressService;
    @Resource
    private IAppUserService appUserService;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AppUser insert(Object... arg) {
        System.out.println(Arrays.toString(arg));
        AppAddress appAddress=new AppAddress();
        AppUser appUser=new AppUser();
        appAddress.setId(Integer.parseInt(arg[0].toString()));
        appAddress.setAddress(arg[1].toString());
        
        appUser.setId(Integer.parseInt(arg[2].toString()));
        appUser.setName(arg[3].toString());

        int j= 0;
           int i=0;
        try {
             i=  appAddressService.insertAddress(appAddress);

            j = appUserService.insertAppUser(appUser);
        } catch (Exception e) {
             e.printStackTrace();
            throw new RuntimeException();

        }
        System.out.println(i+j+"--是谁-------------");

        return appUser;
    }
}
