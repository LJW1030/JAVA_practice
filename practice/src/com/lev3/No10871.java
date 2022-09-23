package com.lev3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n,x,a;
		 n = Integer.parseInt(st.nextToken());
		 x= Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			 a = Integer.parseInt(st.nextToken());
			if(a/x==0) {
				System.out.println(a+" ");
			}
		}
	}
}
