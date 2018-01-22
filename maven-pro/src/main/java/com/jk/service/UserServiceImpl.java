package com.jk.service;

import com.jk.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <pre>项目名称：
 * 类名称：
 * 类描述：(这里用一句话来描述)
 * 创建人：鲍冰辉 535911357@qq.com
 * 创建时间：20:00 2018/1/19
 * 修改人：鲍冰辉 535911357@qq.com
 * 修改时间：20:00 2018/1/19
 * 修改备注：
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    /* (non-Javadoc)
     * @see com.jk.service.UserServie#queryDataTotal()
     */
    @Override
    public long queryDataTotal() {
        return userMapper.queryDataTotal();
    }

    /* (non-Javadoc)
     * @see com.jk.service.UserServie#findUser(java.lang.Integer, java.lang.Integer)
     */
    @Override
    public List<Map<String, Object>> findUser(Integer startPos, Integer pageSize) {
        return userMapper.findUser(startPos,pageSize);
    }

}
