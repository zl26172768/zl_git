package com.db.service;

import com.db.entity.AppUser;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 *  Date: 13-8-27
 * Time: 上午11:22
 * To change this template use File | Settings | File Templates.
 */
public interface IAppUserService {

    public int insertAppUser(AppUser user) throws Exception;
}
