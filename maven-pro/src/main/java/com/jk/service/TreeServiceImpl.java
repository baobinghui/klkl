/** 
 * <pre>项目名称:ssm-shop 
 * 文件名称:TreeServiceImpl.java 
 * 包名:com.jk.service.impl 
 * 创建日期:2017年11月21日下午4:56:02 
 * Copyright (c) 2017, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.List;

import com.jk.dao.TreeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.pojo.Tree;
import com.jk.service.TreeService;

/** 
 * <pre>项目名称：ssm-shop    
 * 类名称：TreeServiceImpl    
 * 类描述：    
 * 创建人：鲍冰辉cht_java@126.com    
 * 创建时间：2017年11月21日 下午4:56:02    
 * 修改人：鲍冰辉 cht_java@126.com  
 * 修改时间：2017年11月21日 下午4:56:02    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class TreeServiceImpl implements TreeService{

	@Autowired
	private TreeMapper treeMapper;

	/* (non-Javadoc)    
	 * @see com.jk.service.TreeService#findTree(int)    
	 */
	public List<Tree> findTree(int i) {
		return treeMapper.findTree(i);
	}
	
	

}
