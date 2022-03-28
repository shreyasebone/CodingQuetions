package com.sebone.java.codingque;

import java.util.Scanner;
/**class name:- VowelChecking
 * Objective:-to check vowel is present or not in given string.
 * @author:-Shreya paliwal
 * Date-28/03/2022
*/

public class VowelChecking {
	/**
	* method name:-isVowel
	* objective:-return true if vowel is present in given string.
	* @param  str
	* @return  flag
	*/
	public boolean isVowel(String str) {
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'||ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I') {
				flag=true;
			}
		}
		return flag;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelChecking vowelChecking =new VowelChecking();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the value of string");
		String str=scanner.nextLine();
		boolean check=vowelChecking.isVowel(str);
		if(check==true) {
			System.out.println("vowel is present in string str");
		}else {
			System.out.println("vowel is not present in string str");
		}
		
		
	}

}
