package com.lev5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(hansu(Integer.parseInt(br.readLine())));
	}
	public static int hansu(int num) {
		int cnt =0;
		if(num<100) {
			return num;
		}
		else {
			cnt=99;
			for(int i=100; i<=num; i++) {
				int h = i/100;
				int t = (i/10)%10;
				int o = i%10;
				if((h-t) == (t-o)) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
