package RandomTest;

import java.util.HashMap;
import java.util.Map;

public class D {

	public static void main(String[] args) {
		//duplticate char in a string

		String s="java";
		//j=1,a=2,v=1

	/* 	char [] c=	s.toCharArray();
		Map<Character, Integer> map= new HashMap<Character, Integer>();

		for (char d : c) {
			if(map.containsKey(d)) {
				map.put(d, map.get(d)+1); //a=2
			}
			else
			{
				map.put(d, 1);  //j=1, a=1,v=1, 
			}
		}
		System.out.println(map);
		
		*/
		
		char[] c=s.toCharArray();
		System.out.println(c);
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c1:c) {
			if(map.containsKey(c1)) {
				map.put(c1, map.get(c1)+1);
			}else
				map.put(c1,1);
		}
	System.out.println(map);
		
	for (Map.Entry entry : map.entrySet()) {
        System.out.println(entry.getKey() + " is present : " + entry.getValue());
    }
		
		
	}
	
	
	//
}