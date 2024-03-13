package method;

import java.util.Scanner;

public class Max_Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int fnum=sc.nextInt();
		System.out.print("Enter second number: ");
		int snum=sc.nextInt();
		max(fnum,snum);
	
		
	}
	public static void max(int fnum,int snum) {
		
		if(fnum>snum) {
			System.out.println(fnum +"is maximum");
			
		}
		else {
			System.out.println(snum +"is maximum");
		}
		//return (fnum+snum);
	}

}
