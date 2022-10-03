package com.lev4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr;
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			double sum = 0;
			for(int j=0; j<n; j++) {
				int su = Integer.parseInt(st.nextToken());
				arr[j] = su;
				sum += su;
			}
			double avg = (sum/n);
			double cnt = 0;
			for(int j=0; j<n; j++) {
				if(arr[j] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", (cnt/n)*100);
		}
		
	}
}
