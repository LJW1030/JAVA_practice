package com.lev3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int c = 0;
		int a1 = a;
		while(true) {
			a = ((a % 10) * 10) + (((a/10) + (a % 10)) % 10);
			c++;
			if(a1 == a) {
				break;
			}
		}
		System.out.println(c);
	}
}
