package com.ngemobi.service;

import java.util.List;

public interface OadsService {
	
	/**
	 * 得到全部应用的名称
	 * @return
	 */
	List<String> getPkgName();
	
	/**
	 * 添加下架的应用名称
	 * @param pkgName
	 */
	void addPkgName(String pkgName);

	/**
	 * 使用pkg查询该pkg是否已经存在
	 * @param pkg
	 * @return
	 */
	void getpkg(String pkg);
}
