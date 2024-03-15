package com.learning.core.day6;
import java.util.*;
import java.util.Map.Entry;
public class D06P01 {
	public static void main(String[]args) {
		Map<String,Long> m = new LinkedHashMap<>();
		m.put("Amal",998787823L);
		m.put("Manvitha",937843978L);
		m.put("Joseph",7882221113L);
		m.put("Smith",8293893311L);
		m.put("Kathe",7234560011L);
		for(String key:m.keySet()) {
			System.out.println(key+" "+m.get(key));
		}
		/*for( Entry<String, Long> x: m.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}*/
	}
}
