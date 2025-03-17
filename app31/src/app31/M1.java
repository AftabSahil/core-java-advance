package app31;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class M1 {
	public static void main(String[] args) {
		//no thread safe
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("abc1", 129);
		map1.put("abc2", 129);
		map1.put("abc3", 129);
		map1.put("abc4", 129);
		map1.put("abc5", 129);
		System.out.println(map1);
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map2 = Collections.synchronizedMap(map2);
		//fully thread safe
		map2.put("abc1", 129);
		map2.put("abc2", 129);
		map2.put("abc3", 129);
		map2.put("abc4", 129);
		map2.put("abc5", 129);
		System.out.println(map2);
		
		//fully thread safe and very faster in the execution
		Map<String, Integer> map3 = new ConcurrentHashMap<String, Integer>();
		map3.put("abc1", 234);
		map3.put("abc2", 234);
		map3.put("abc3", 234);
		map3.put("abc4", 234);
		map3.put("abc5", 234);
		
		
	}
}
