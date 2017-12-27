package com.ngemobi.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngemobi.mapper.OadsMapper;
import com.ngemobi.service.OadsService;

@Service
public class OadsServiceImpl implements OadsService {
	@Autowired
	private OadsMapper oadsMapper;
	
	@Override
	public List<String> getPkgName() {
		//查询出的全部结果
		List<String> list = oadsMapper.selectPkgName();
		//筛选后的全部结果
		List<String> pkgList = new ArrayList<>();
		for (String pkg : list) {
			try {
				//使用url访问谷歌商店，通过url得到document
				Document doc = Jsoup.connect("https://play.google.com/store/search?q="+pkg).get();
				//获取document中包含"empty-search"类选择器
				Elements ele=doc.getElementsByClass("empty-search");
				for (Element link : ele) {
					//便利element得到文本
					  String linkText = link.text();
					  Thread.sleep((int)(Math.random()*1000+1001));
					  System.out.println((int)(Math.random()*1000+1001));
					  
					  //文/]本当中是否包含其中的关键信息
					  if(linkText.contains("找不到任何與您的搜尋查詢")&&linkText.contains("相符的結果。 建議︰ 請確定沒有錯字。 請嘗試不同的關鍵字。 請試用含義較廣的關鍵字。")){
						  //System.out.println("-----"+pkg+linkText);
						  pkgList.add(pkg);
					  }
					}
			} catch (Exception e) {
				System.err.println("404包："+pkg);
				//e.printStackTrace();
				//连续访问会有404出现
				
			} 
		}
		return pkgList;
	}

	@Override
	public void addPkgName(String pkgName) {
		//添加
		oadsMapper.insertPkgName(pkgName);
	}

	@Override
	public void getpkg(String googlePkg) {
		//使用在商店中无法找到的pkg，去数据库查询
		String rePkg = oadsMapper.selectPkgByPkg(googlePkg);
		if(rePkg==null||rePkg.equals("")){
			oadsMapper.insertPkgName(googlePkg);
		}
	
	
	}

}
