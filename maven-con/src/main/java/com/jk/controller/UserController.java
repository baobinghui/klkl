package com.jk.controller;

import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>项目名称：
 * 类名称：
 * 类描述：(这里用一句话来描述)
 * 创建人：鲍冰辉 535911357@qq.com
 * 创建时间：20:28 2018/1/19
 * 修改人：鲍冰辉 535911357@qq.com
 * 修改时间：20:28 2018/1/19
 * 修改备注：
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("toShowList")
    public String toShowList(){
       return "showList";
    }


    //查询用户信息并分页
    @RequestMapping("showList")
    @ResponseBody
    public Map<String,Object> findUser(Integer startPos, Integer pageSize ){

        Map<String, Object> map=new HashMap<String, Object>();

        //查询数据总条数
        long dataTotal=userService.queryDataTotal();

        List<Map<String,Object>> list=userService.findUser(startPos,pageSize);


        map.put("total", dataTotal);

        map.put("rows", list);

        return map;

    }

}