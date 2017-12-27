package com.ngemobi.mapper;

import java.util.List;

public interface OadsMapper {
	/**
	 * 查询应用名称
	 * @return
	 */
	List<String> selectPkgName();
	
	/**
	 * 添加应用名称
	 * @param name
	 */
	void insertPkgName(String name);
	
	/**
	 * 用pkg去数据库查询是否存在
	 * @param pkg
	 * @return
	 */
	String selectPkgByPkg(String pkg);
	
	
}
