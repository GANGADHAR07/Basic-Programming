package com.dxc.practice;

import java.util.Scanner;

public class Sum_given_num {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		 int n = 0;
		int arr[] = new int[5];
		
		int sum=0;
		for(int i=1;i<=5;i++) {
			System.out.println("enter n val___");
			 n = sc.nextInt();
			sum=sum+i;
		}
			System.out.println("total is"+sum);
		
		
			}

}
