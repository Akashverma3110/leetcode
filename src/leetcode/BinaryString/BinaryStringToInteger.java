package leetcode.BinaryString;

import java.util.Scanner;

public class BinaryStringToInteger {
	
	public static String AddBits(String str,int additional) {
		String zeros="";
		for(int i=0;i<additional;i++) {
			zeros+='0';
		}
		//System.out.println(zeros);
		zeros+=str;
		return zeros;
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			 System.out.println("Enter the first binary string");
			 String first=sc.next();
			 System.out.println("Enter the second binary string");
			 String second=sc.next();
			 int maxLen,minLen;
			 
			 if(first.length()>second.length()) {
				 maxLen=first.length();
				 minLen=second.length();
				second= AddBits(second,maxLen-minLen);
			 }else {
				 maxLen=second.length();
				 minLen=first.length();
				 first=AddBits(first,maxLen-minLen);
			 }
			 //System.out.println(first);
			// System.out.println(second);
			 char carry='0';
			 String result="";
			 for(int i=maxLen-1;i>=0;i--) {
				 //System.out.println(i);
				 if(first.charAt(i)=='1' && second.charAt(i)=='1') {
					// System.out.print("2");
					 if(carry=='0') {
						 result='0'+result;
						 carry='1';
					 }else {
						 result='1'+result;
						 carry='1';
					 }
				 }else if(first.charAt(i)=='0' && second.charAt(i)=='0') {
					// System.out.print("3");
					 if(carry=='0') {
						 result='0'+result;
						 carry='0';
					 }else {
						 result='1'+result;
						 carry='0';
					 }
				 }else {
					 if(carry=='0') {
						 result='1'+result;
						 carry='0';
					 }else {
						 result='0'+result;
						 carry='1';
					 }
				 }
			 }
			 if(carry=='1') {
				 result='1'+result;
			 }
			 System.out.println(result);
		}

	}

}
