/** 
 * <pre>项目名称:ssm-shop 
 * 文件名称:TreeService.java 
 * 包名:com.jk.service 
 * 创建日期:2017年11月21日下午4:55:11 
 * Copyright (c) 2017, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.List;

import com.jk.pojo.Tree;

/** 
 * <pre>项目名称：ssm-shop    
 * 类名称：TreeService    
 * 类描述：    
 * 创建人：鲍冰辉cht_java@126.com    
 * 创建时间：2017年11月21日 下午4:55:11    
 * 修改人：鲍冰辉 cht_java@126.com  
 * 修改时间：2017年11月21日 下午4:55:11    
 * 修改备注：       
 * @version </pre>    
 */
public interface TreeService {

	/** <pre>findTree(这里用一句话描述这个方法的作用)   
	 * 创建人：鲍冰辉cht_java@126.com     
	 * 创建时间：2017年11月28日 上午11:59:26    
	 * 修改人：鲍冰辉cht_java@126.com      
	 * 修改时间：2017年11月28日 上午11:59:26    
	 * 修改备注： 
	 * @param i
	 * @return</pre>    
	 */
	List<Tree> findTree(int i);

}
