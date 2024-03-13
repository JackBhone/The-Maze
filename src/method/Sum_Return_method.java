package method;

import java.util.Scanner;

public class Sum_Return_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number: ");
int fnum=sc.nextInt();
System.out.print("Enter second number: ");
int snum=sc.nextInt();
int result=fnum+snum;
System.out.println("Sum of the numbers " +result);

	}
	
	public static int sum(int fnum,int snum) {
		int sum=fnum+snum;
		return sum;
		//return (fnum+snum);
	}

}
