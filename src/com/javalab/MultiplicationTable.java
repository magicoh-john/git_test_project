package com.javalab;
/**
 * 구구단을 가로와 세로로 출력하는 예제22222
 * @author magic
 *
 */
public class MultiplicationTable {
	public static void main(String[] args) {

		System.out.println();
		
		System.out.println("구구단 세로 출력===========================================");
		
		for (int i = 2; i <= 9; i++) {
			System.out.println("*****" + i + "단 *****");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d %n", i, j, (i * j));
			}
		}

		System.out.println("구구단 가로 출력===========================================");

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d \t", j, i, (j * i));
			}
			System.out.println();
		}
	}
}
