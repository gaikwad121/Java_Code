package programs_Practice;

public class program8 {

	public static void lengthOfFirstWordInString(String str) {
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				count++;
			}else {
				if(count>0) {
				System.out.println("Length of first word in string : "+count);	
				break;
				}
			}
		}
	}
}
