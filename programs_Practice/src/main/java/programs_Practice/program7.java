package programs_Practice;

public class program7 {

	public static void printEvenWordLengthChar(String str) {
String str2[]=str.split(" ");
for(String word:str2) {
	int length=word.length();
	if(length%2==0) {
		System.out.println("even length word are : "+word);
	}
	}
	}
}
