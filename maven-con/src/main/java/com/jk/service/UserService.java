package com.jk.service;

import java.util.List;
import java.util.Map;

/**
 * <pre>项目名称：
 * 类名称：
 * 类描述：(这里用一句话来描述)
 * 创建人：鲍冰辉 535911357@qq.com
 * 创建时间：20:31 2018/1/19
 * 修改人：鲍冰辉 535911357@qq.com
 * 修改时间：20:31 2018/1/19
 * 修改备注：
 */
public interface UserService {
    /** <pre>queryDataTotal(这里用一句话描述这个方法的作用)
     * 创建人：鲍冰辉cht_java@126.com
     * 创建时间：2018年1月19日 上午7:49:53
     * 修改人：鲍冰辉cht_java@126.com
     * 修改时间：2018年1月19日 上午7:49:53
     * 修改备注：
     * @return</pre>
     */
    long queryDataTotal();

    /** <pre>findUser(这里用一句话描述这个方法的作用)
     * 创建人：鲍冰辉cht_java@126.com
     * 创建时间：2018年1月19日 上午7:49:57
     * 修改人：鲍冰辉cht_java@126.com
     * 修改时间：2018年1月19日 上午7:49:57
     * 修改备注：
     * @param startPos
     * @param pageSize
     * @return</pre>
     */
    List<Map<String, Object>> findUser(Integer startPos, Integer pageSize);
}
