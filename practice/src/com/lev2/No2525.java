package com.lev2;

import java.util.Scanner;

public class No2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int ab = 60*a+b;
		ab += c;
		
		int h = (ab/60)%24;
		int m = ab%60;
		System.out.println(h+" "+m);
	}
}
