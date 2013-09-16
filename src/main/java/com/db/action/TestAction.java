package com.db.action;

import com.db.business.ITestBusniess;
import com.db.entity.AppUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: 提子
 * Date: 13-8-27
 * Time: 下午12:26
 * To change this template use File | Settings | File Templates.
 */
@RequestMapping("test")
@Controller
public class TestAction {
    @Resource(name = "testBusiness")
    private ITestBusniess testBusniess;

    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public @ResponseBody
    AppUser test(WebRequest request){
        String id1=request.getParameter("id1");
        String id2=request.getParameter("id2");
        String name=request.getParameter("name");
        String address=request.getParameter("address");
        AppUser appUser=testBusniess.insert(id1,address,id2,name);
        System.out.println("test");
        System.out.println("test2");


        return appUser;
    }

}
