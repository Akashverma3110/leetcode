package squareRoot;

import java.util.Scanner;

public class SqrRoot {

	public static void main(String[] args) {
		// TODO12 Auto-generated method stub
		try(Scanner sc =new Scanner(System.in)){
			System.out.println("Enter the numbre");
			long num=sc.nextLong();
			for(long i=0;i<=num;i++) {
				if(i*i==num) {
					System.out.println("Square root of the above number is "+i);
					break;
				}else if(i*i>num) {
					System.out.println("Floor value of the given number is "+(i-1));
					break;
				}
			}
		}

	}

}
