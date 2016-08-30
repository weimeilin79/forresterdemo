package com.mycompany.camel.producer;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class MQTTParser {

	public Map<String, Object> parse(String msg){
		Map<String, Object> mqttMaps = new HashMap<String, Object>();
		msg = msg.substring(1, msg.length()-1);
		StringTokenizer st = new StringTokenizer(msg);

		while (st.hasMoreElements()) {
			msg = msg.replace(",", "");
			String singleParam = (String)st.nextElement();
			
			
			StringTokenizer inputST = new StringTokenizer(singleParam,"=");
			
			while (inputST.hasMoreElements()) {
				String header = (String)inputST.nextElement();
				String values = ((String)inputST.nextElement()).replace(",", "");
				if ("id".equals(header)){
					mqttMaps.put(header,String.valueOf(values));
				}else{
					mqttMaps.put(header,values);
				}
			} 
			
		}

		System.out.println(mqttMaps);
		return mqttMaps;
	}
	
	
}
