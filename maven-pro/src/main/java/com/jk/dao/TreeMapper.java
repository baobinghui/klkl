/** 
 * <pre>项目名称:ssm-shop 
 * 文件名称:TreeMapper.java 
 * 包名:com.jk.dao 
 * 创建日期:2017年11月21日下午4:58:20 
 * Copyright (c) 2017, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jk.pojo.Tree;

/** 
 * <pre>项目名称：ssm-shop    
 * 类名称：TreeMapper    
 * 类描述：    
 * 创建人：鲍冰辉cht_java@126.com    
 * 创建时间：2017年11月21日 下午4:58:20    
 * 修改人：鲍冰辉 cht_java@126.com  
 * 修改时间：2017年11月21日 下午4:58:20    
 * 修改备注：       
 * @version </pre>    
 */
@Mapper
public interface TreeMapper {

	/** <pre>findTree(这里用一句话描述这个方法的作用)   
	 * 创建人：鲍冰辉cht_java@126.com     
	 * 创建时间：2017年11月28日 下午12:00:56    
	 * 修改人：鲍冰辉cht_java@126.com      
	 * 修改时间：2017年11月28日 下午12:00:56    
	 * 修改备注： 
	 * @param i
	 * @return</pre>    
	 */
	@Select("select T_ID as id, T_TEXT as text, T_HREF as url, T_PID as pid from a_tree where t_pid=#{pid}")
	List<Tree> findTree(int i);


}
