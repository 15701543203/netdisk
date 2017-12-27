package com.ngemobi.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ngemobi.service.OadsService;

/**
 * 执行定时任务的方法
 * 
 * @Author user
 *
 * @Date 2017年12月24日
 */
public class QuartJob {
	@Autowired
	private OadsService oadsService;

	public void execute() {
		System.out.println("定点执行任务开始!");		
		//获取到商店里没有的pkg
		List<String> list = oadsService.getPkgName();	
		//循环遍历，添加到数据库
		for (String pkg : list) {
			System.out.println(pkg);
			addPkg(pkg);
		}
	}
	/**
	 * 使用在谷歌商店查询到的pkg再去查询是否已经在数据库中
	 * @param pkgName
	 */
	public void addPkg(String pkgName){
		oadsService.addPkgName(pkgName);
	}
}
