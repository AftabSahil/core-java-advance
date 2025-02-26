package app3;

import java.util.Scanner;

public class NN {
	public static void main(String[] args) {
		int r= 6,c=6;
		for(int i = 1; i <=r; i++) {
			for(int j = 1; j <= c;j++) {
				if(i == j) {
					System.out.print(0 + " ");
				}
				else if(i + j == r+1) {
					System.out.print(0 + " ");
				}
				else if(j <= i){
					System.out.print(j + " ");
				}
				else {
					System.out.print((j - 1) + " ");
				}
			}
			System.out.println();
		}
	}
}
