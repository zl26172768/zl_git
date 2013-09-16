package com.db.service.impl;

import com.db.entity.AppUser;
import com.db.mapper.AppUserMapper;
import com.db.service.IAppUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 13-8-27
 * Time: 上午11:25
 * To change this template use File | Settings | File Templates.
 */
@Service
public class AppUserService implements IAppUserService {

    @Resource(name = "appUserMapper")
    public AppUserMapper appUserMapper;

    @Override
    public int insertAppUser(AppUser user) throws Exception{

           if (user.getId()==100){
               throw new Exception();
           }
               int i=appUserMapper.insertSelective(user);
        return i;
    }

    public void setAppUserMapper(AppUserMapper appUserMapper) {
        this.appUserMapper = appUserMapper;
    }
}
