/** 
 * <pre>项目名称:ssm-dome 
 * 文件名称:Tree.java 
 * 包名:com.jk.pojo.tree 
 * 创建日期:2017年11月17日下午8:25:35 
 * Copyright (c) 2017, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.pojo;

import java.io.Serializable;
import java.util.List;

/** 
 * <pre>项目名称：ssm-dome    
 * 类名称：Tree    
 * 类描述：    
 * 创建人：鲍冰辉cht_java@126.com    
 * 创建时间：2017年11月17日 下午8:25:35    
 * 修改人：鲍冰辉 cht_java@126.com  
 * 修改时间：2017年11月17日 下午8:25:35    
 * 修改备注：       
 * @version </pre>    
 */
public class Tree implements Serializable{

	private static final long serialVersionUID = -5681454113820324332L;
	private Integer id;
	
	private String text;
	
	private String url;
	
	private Integer pid;
	
	private List<Tree> nodes;
	
	private String state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Tree> getNodes() {
		return nodes;
	}

	public void setNodes(List<Tree> nodes) {
		this.nodes = nodes;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
