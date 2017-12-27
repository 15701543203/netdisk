//package com.ngemobi.utils;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import com.google.gson.Gson;
//
//public class MapToJsonUtils {
//
//	public static String mapToJson(String ...strings){
//		Map<String, String>map = new HashMap<String,String>();
//		
//		for (int i = 0; i < strings.length; i++) {
//			System.out.println(strings[i]);
//			map.put(strings[i], strings[i+1]);
//		}
//		Gson gson = new Gson();
//		String s = gson.toJson(map);
//		return s;
//	}
//	
//}
