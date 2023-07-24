package addingOneToArray;

import java.util.Scanner;
import java.util.Stack;

public class AddingOneToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter the size of array");
			int len=sc.nextInt();
			int[] arr=new int[len];
			int number=0;
			String str2="";
			for(int i=0;i<len;i++) {
				arr[i]=sc.nextInt();
				//str2+=Integer.toString(arr[i]);
			}
			//char[] ch=str2.toCharArray();
			//System.out.println(str2);
//			int temp;
//			number++;
//			String str=Integer.toString(number);
//			int len2=str.length();
//			int[] arr2=new int[len2];
//			for(int i=len2-1;i>=0;i++) {
//				temp=number%10;
//				number/=10;
//				arr2[i]=temp;
//			}
//			
//			for(int i=0;i<len2;i++) {
//				System.out.print(arr2[i]);
//			}
//			int i= ch.length-1;
//			boolean exit=false;
//		    while(i>=0 && !exit) {
//				switch (ch[i]) {
//				case '9':
//					ch[i--]='0';
//					break;
//				case '8':
//					ch[i]='9';
//					exit=true;
//					break;
//				case '7':
//					ch[i]='8';
//					exit=true;
//					break;
//				case '6':
//					ch[i]='7';
//					exit=true;
//					break;
//				case '5':
//					ch[i]='6';
//					exit=true;
//					break;
//				case '4':
//					ch[i]='5';
//					exit=true;
//					break;
//				case '3':
//					ch[i]='4';
//					exit=true;
//					break;
//				case '2':
//					ch[i]='3';
//					exit=true;
//					break;
//				case '1':
//					ch[i]='2';
//					exit=true;
//					break;
//				case '0':
//					ch[i]='1';
//					exit=true;
//					break;
//				
//				}
//				
//		    }
//		    String result=ch.toString();
//		    int[] results=new int[result.length()];
//		    for(i=0;i<result.length();i++) {
//		    	results[i]=result.charAt(i)-'0';
//		    	System.out.println(result.charAt(i));
//		    }
//			
			
			Stack<Integer> stack=new Stack();
			Stack<Integer> result=new Stack();
			
			if(arr[len-1]!=9) {
				arr[len-1]+=1;
			}else {
				
			}
			
			for(int i=0;i<len;i++) {
				stack.push(arr[i]);
			}
			
			while(!stack.isEmpty()) {
				if(stack.pop()==9) {
					result
				}
			}
			
		}

	}

}
