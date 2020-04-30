package com.nt.view;
import java.util.Scanner;

import com.nt.pojo;
class  MainClass{

	public static void main(String[] args) 
	{
		System.out.println("Main execution start...");
		Scanner sc = new Scanner(System.in);
		int capacity ;
		String option = "N";
		System.out.println("Enter the Capacity of students..");
		capacity = sc.nextInt();
		Student[] s = new Student[capacity];
		int index = 0;
		do{
				s[index] = new Student();
				System.out.println("Enter the student details\t");

				System.out.print("Enter the Student no:\t");
				s[index] = sc.nextInt();	sc.nextInt();
				System.out.print("Enter the Student Name:\t");
				s[index] = sc.nextInt();	
				System.out.print("Enter the Course:\t");
				s[index] = sc.nextInt();
				System.out.pritntln("Do you want to continue (Y/N):");
				index++;
		}while(index<capacity);
		
		System.out.println("College students are:");
		for(Student s: s){
			s[index].display();
		}
		System.out.println("Main execution end...");

		
	}
}
