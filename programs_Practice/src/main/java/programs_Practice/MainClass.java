package programs_Practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainClass {
public static void main(String[] args) {
	String str="HelloDHello";
	String str2="jyoti";
	String str3="Aishwarya";
	String str4="Hello World i am Jyoti Gaikwad i am a Software Engineer";
	str3=str3.toLowerCase();
	char ch[]=str.toCharArray();
	//duplicateChar(str);
	program1.duplicateChar(str);
	program1.duplicateChar(ch, str);
	program2.duplicateChar(ch, str);
    program3.sortStringChar(str2);
	program3.sortStringChar2(str2);
	program4.descendingOrderChar(str2);
	program5.occuranceChar(str3);
	program6.LastWordofStringLength(str4);
	program8.lengthOfFirstWordInString(str4);
	program7.printEvenWordLengthChar(str4);
}
}
	