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
		System.out.println("开始执行");		
		List<String> list = oadsService.getPkgName();
		for (String string : list) {
			addPkg(string);
		}
	}
	public void addPkg(String pkgName) {
		oadsService.addPkgName(pkgName);
	}
}
