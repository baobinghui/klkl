package com.jk.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <pre>项目名称：
 * 类名称：
 * 类描述：(这里用一句话来描述)
 * 创建人：鲍冰辉 535911357@qq.com
 * 创建时间：20:02 2018/1/19
 * 修改人：鲍冰辉 535911357@qq.com
 * 修改时间：20:02 2018/1/19
 * 修改备注：
 */
@Mapper
public interface UserMapper {

    /** <pre>queryDataTotal(这里用一句话描述这个方法的作用)
     * 创建人：鲍冰辉cht_java@126.com
     * 创建时间：2018年1月19日 上午7:53:11
     * 修改人：鲍冰辉cht_java@126.com
     * 修改时间：2018年1月19日 上午7:53:11
     * 修改备注：
     * @return</pre>
     */
    @Select("select count(1) from a_user")
    long queryDataTotal();

    /** <pre>findUser(这里用一句话描述这个方法的作用)
     * 创建人：鲍冰辉cht_java@126.com
     * 创建时间：2018年1月19日 上午7:53:16
     * 修改人：鲍冰辉cht_java@126.com
     * 修改时间：2018年1月19日 上午7:53:16
     * 修改备注：
     * @param startPos
     * @param pageSize
     * @return</pre>
     */
    @Select("select user_id as userId,user_name as userName from a_user limit #{startPos},#{pageSize}")
    List<Map<String, Object>> findUser(@Param("startPos") Integer startPos, @Param("pageSize") Integer pageSize);

}
