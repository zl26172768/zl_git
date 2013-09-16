package com.db.service.impl;

import com.db.entity.AppAddress;
import com.db.mapper.AppAddressMapper;
import com.db.service.IAppAddressService;
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
public class AppAddressService implements IAppAddressService {


    @Resource(name = "appAddressMapper")

    public AppAddressMapper appAddressMapper;


    @Override
    public int insertAddress(AppAddress appAddress) {
        int i=appAddressMapper.insertSelective(appAddress);
        return i;  }

    public void setAppAddressMapper(AppAddressMapper appAddressMapper) {
        this.appAddressMapper = appAddressMapper;
    }
}
