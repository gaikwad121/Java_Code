package programs_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class program3 {

	public static String  sortStringChar(String str) {
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]>ch[j]) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			}
		}
		}
	System.out.println("The Sorted String is : "+new String(ch));
	return new String(ch);
	}

public static String  sortStringChar2(String str) {
	char ch[]=str.toCharArray();
	Arrays.sort(ch);
	System.out.println(new String(ch));
	return str;
	
}

}
