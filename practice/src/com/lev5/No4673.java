package com.lev5;


public class No4673 {
	public static void main(String[] args) {
		boolean[] chk = new boolean[10001];
		for(int i=1; i<10001; i++) {
			int n = d(i);
			if(n<10001) {
				chk[n] = true;
			}
		}
		for(int i=1; i<10001; i++) {
			if(!chk[i]) {
				System.out.println(i);
			}
		}
	}
	public static int d(int num) {
		int sum = num;
		while(num!=0) {
			sum = sum + (num%10);
			num = num/10;
		}
		return sum;
	}
}
