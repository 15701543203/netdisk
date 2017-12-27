package com.ngemobi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ngemobi.service.OadsService;

@Controller
@RequestMapping("/google")
public class OadsController {
	@Autowired
	private OadsService oadsService;
	
	
	/**
	 * 在谷歌商店中查询该应用是否下架
	 * 
	 */
	@RequestMapping(value="search",method=RequestMethod.POST)
	public void searchPkg(){
		//获取到商店里没有的pkg
		List<String> list = oadsService.getPkgName();	
		//循环遍历，添加到数据库
		for (String string : list) {
			addPkg(string);
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
