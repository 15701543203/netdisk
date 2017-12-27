package com.ngemobi.utils;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
public class JsonToMap {
   /**
    *
    * 函数名称: parseData
    * 函数描述: 将json字符串转换为map
    * @param data
    * @return
    */
   public static Map<String, String> parseData(String data){
       GsonBuilder gb = new GsonBuilder();
       Gson g = gb.create();
       Map<String, String> map = g.fromJson(data, new TypeToken<Map<String, String>>() {}.getType());
       return map;
   }

}