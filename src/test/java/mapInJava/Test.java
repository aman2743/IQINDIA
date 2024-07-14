package mapInJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	HashMap<Integer,String> hm =new HashMap<Integer,String>();
	hm.put(123,"sachin");
	hm.put(133,"chanchal");
	hm.put(134,"manish");
//	System.out.println(hm);
	
//	System.out.println(hm.get(123));
//	
//	System.out.println(hm.containsKey(123));
//	
//	System.out.println(hm.containsValue("manish11"));
	
	Set<Integer> s=hm.keySet();
	
	System.out.println(s);
	
	Collection<String> c=hm.values();
	System.out.println(c);
	
	Set<Entry<Integer, String>> es=hm.entrySet();
	System.out.println(es);
	
	
	}
}
