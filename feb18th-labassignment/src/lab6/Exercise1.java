package lab6;

import java.util.*;

public class Exercise1 {
	
	public static List getValues(HashMap map) {
		
		List arr = new ArrayList();
		
		for(Object i: map.values()) {
			arr.add(i);
			//System.out.println(i);
			
		}
		
//		for(Object i: map.keySet()) {
//			System.out.println(i);
//		}
//		
//		for(Object i:map.entrySet()) {
//			System.out.println(i);
//		}
		//System.out.println(arr);
		Collections.sort(arr);
		return arr;
		
		
		
	}
	
	public static void main(String[] args) {
		HashMap m =new HashMap();
		m.put(1, "A");
		m.put(4, "E");
		m.put(2,"C");
		m.put(3, "B");
		
		List out= getValues(m);
		
		System.out.println(out.toString());
		
	}

}
