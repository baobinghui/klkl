/** 
 * <pre>项目名称:ssm-shop 
 * 文件名称:TreeController.java 
 * 包名:com.jk.controller 
 * 创建日期:2017年11月21日下午4:54:32 
 * Copyright (c) 2017, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jk.pojo.Tree;
import com.jk.service.TreeService;


/** 
 * <pre>项目名称：ssm-shop    
 * 类名称：TreeController    
 * 类描述：    
 * 创建人：鲍冰辉cht_java@126.com    
 * 创建时间：2017年11月21日 下午4:54:32    
 * 修改人：鲍冰辉 cht_java@126.com  
 * 修改时间：2017年11月21日 下午4:54:32    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
public class TreeController {
	
	@Autowired
	private TreeService treeService;
	
	@RequestMapping("findTree")
	@ResponseBody
	public  List<Tree>  findTree(){
		List<Tree> list=treeService.findTree(0);
	
		List<Tree> parentTree = parentTree(list);
	
		return parentTree;
	}
	
	
	public  List<Tree> parentTree(List<Tree> list){
		List<Tree>  childList=new ArrayList<Tree>();
		
		for (int i = 0; i < list.size(); i++) {
			Tree tree = list.get(i);  
			
			List<Tree> findTree = treeService.findTree(tree.getId());
			//  判断他有没有子节点
			if(findTree.size()>0){   //  true
				//  当前 子节点的集合
				List<Tree> getchirdMenu = getchirdMenu(findTree);
				//  将子节点 数据装进  list
				tree.setNodes(getchirdMenu);
				childList.add(tree);
			}else{
				childList.add(tree);
			}
		}
		
		return  childList;
	}
	
	
	public  List<Tree> getchirdMenu(List<Tree> list){
		List<Tree>  childList=new ArrayList<Tree>();
		for (int i = 0; i < list.size(); i++) {
			Tree tree = list.get(i);  
			List<Tree> findTree = treeService.findTree(tree.getId());
			
			//  判断他有没有子节点
			if(findTree.size()>0){
				List<Tree> getchirdMenu = getchirdMenu(findTree);
				//  将子节点 数据装进  list
				tree.setNodes(getchirdMenu);
				childList.add(tree);
			}else{
				
				childList.add(tree);
			}
		}
		
		return   childList;
	};
	

}
