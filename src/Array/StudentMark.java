package Array;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 
		int studentmark[]=new int[10];
		System.out.print("Enter student mark :");
		
		for(int i=0;i<studentmark.length;i++) {
			studentmark[i]=sc.nextInt();
			
		}
		int sum=0;
		for(int i=0;i<studentmark.length;i++) {
			sum+=studentmark[i];
		}
		double avg=studentmark.length;
		
		System.out.println("Average mark: "+avg);
		int count=0;
		for(int i=0;i<studentmark.length;i++) {
			if(studentmark[i]>avg)count++;
		}
		System.out.println(count+"");
			}

	}


