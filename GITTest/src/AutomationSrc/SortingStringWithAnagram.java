package AutomationSrc;

import java.util.ArrayList;
import java.util.List;

import com.gargoylesoftware.htmlunit.html.xpath.LowerCaseFunction;

import net.bytebuddy.description.modifier.SynchronizationState;

public class SortingStringWithAnagram {

	public String sortString(String one)
	{

String output="";
char temp;
char ch[] = one.toCharArray();

for(int i=0;i<ch.length;i++)
{	for(int j=0;j<ch.length;j++)
	{
		if(ch[i]<ch[j])
		{
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		
		} 	}
	
} // Outer for Loop


for(int k=0;k<ch.length;k++)
	output=output+ch[k];
return output;	
		
	}

	
	
	public static void main(String[] args) {
		
String one = "Silent";
String two = "ListeN";
SortingStringWithAnagram obj = new SortingStringWithAnagram();
String str1 = obj.sortString(one.toLowerCase());
String str2 = obj.sortString(two.toLowerCase());

System.out.println(str1+ "   Anagram     " + str2);





}

}