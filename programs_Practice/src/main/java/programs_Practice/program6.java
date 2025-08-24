package programs_Practice;

public class program6 {

	public static void LastWordofStringLength(String str) {
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]!=' ') {
				count++;
			}else {
				if(count>0) {
					System.out.println("Length of last word in string : "+count);	
		              break;

				}
			}
		}
	}
}
