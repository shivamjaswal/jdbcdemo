package com.trantor;

import java.util.Scanner;

public class InsertDetails {

	public static void main(String[] args) {

		StudentData sd = new StudentData();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Eno: ");
		sd.setEno(sc.nextInt());
		
		System.out.println("Enter Name: ");
		sd.setName(sc.next());
		
		System.out.println("Enter Salary: ");
		sd.setSalary(sc.nextDouble());
		
		
	}

}
