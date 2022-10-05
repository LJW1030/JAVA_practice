package com.lev6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum = 0;
		for(byte val : br.readLine().getBytes() ) {
			sum += (val - '0');
		}
		System.out.println(sum);
	}
}
