//Q 5 wap to check if string is palindrome or not 
package string_lab;

import java.util.Scanner;

public class Palindrome5 {

	public static void main(String[] args) {
		int flag=0;
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		a=sc.next();
	for(int i=0;i<=(a.length())/2;i++)
	{
		if(a.charAt(i)!=a.charAt(a.length()-i-1))
				{
			System.out.println("String is not palindrome");
			flag=1;break;
				}
	}
	if(flag==0) {System.out.println("String is palindrome");}

	}

}
