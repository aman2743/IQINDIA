package mapInJava;

import java.util.HashMap;

public class CharacterOccurance2 {

	public static void main(String[] args) {
		String str="i am iin interested in automation";
		int len=str.length();
		int count=0;
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0; i<len;i++) {
			char c=str.charAt(i);
			if(hm.containsKey(c)) {
				count=hm.get(c);
				count++;
				hm.replace(c, count);
				
			}else {
				hm.put(c,1);
			}
		}
		
		
		char mfc=str.charAt(0);
		
		for(Character ch:hm.keySet()) {
			if(hm.get(ch)>hm.get(mfc)) {
				mfc=ch;
			}
		}
		System.out.println(mfc+":"+hm.get(mfc));

	}

}
