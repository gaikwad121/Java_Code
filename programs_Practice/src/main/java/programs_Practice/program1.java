package programs_Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class program1 {

	public static void duplicateChar(String str) {
		char ch[]=str.toCharArray();
		Set<Character>set=new LinkedHashSet<Character>();
		StringBuilder sb=new StringBuilder();
		for(char ch1:ch) {
			set.add(ch1);
		}
		for(char ch2:set) {
			//System.out.println(ch2);
			sb.append(ch2);
		}
		System.out.println("Non repeated char"+sb);
	}
// second Approach 

	public static void duplicateChar(char ch[],String str) {
		ch=str.toCharArray();
	StringBuilder sb=new StringBuilder();
		for(int i=0;i<ch.length;i++) {
			boolean repeated=false;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				repeated=true;
				break;
			}
		}
			if(!repeated) {
				sb.append(ch[i]);
			}
		}
		
		System.out.println("non repeated char"+new String(sb));
		
	}
}



