package programs_Practice;

public class program4 {

	public static String descendingOrderChar(String str) {
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]<ch[j]) {
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			}
		}
		}
		System.out.println(new String (ch));
		
		return new String(ch);
		
	}
}
