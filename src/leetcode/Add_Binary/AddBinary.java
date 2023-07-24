package leetcode.Add_Binary;

import java.util.ArrayList;
import java.util.Scanner;

public class AddBinary {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter first binary numbers");
			long first=sc.nextLong();
			//ArrayList<Integer> list=new ArrayList<>();
			System.out.println("Enter second binnary number");
			long sec=sc.nextLong();
		    long result=AdditionOfTwoBinary(first,sec);
			System.out.println("Addition of two binary numbers: "+result);
			
		}

	}

	private static long AdditionOfTwoBinary(long first, long sec) {
		long num1=BinaryToDecimal(first);
		long num2=BinaryToDecimal(sec);
		long result=DecimalToBinary(num1+num2);
		
		return result;
	}

	private static long DecimalToBinary(long l) {
		String binary="";
		long digit;
		while(l!=0) {
			digit=l%2;
			binary+=String.valueOf(digit);
			l/=2;
		}
		//System.out.println(binary);
		
		return Long.parseLong(Reverse(binary));
	}

	private static String Reverse(String binary) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=binary.length()-1;i>=0;i--) {
			rev+=binary.charAt(i);
		}
		return rev;
	}

	private static long BinaryToDecimal(long first) {
		int rem;
		long decimal=0;
		long temp=first;
		int count=0;
		while(temp!=0) {
			rem=(int) (temp%10);
			decimal+=rem*Math.pow(2, count++);
			temp/=10;
		}
		//System.out.println(decimal);
		
		return decimal;
	}

}
