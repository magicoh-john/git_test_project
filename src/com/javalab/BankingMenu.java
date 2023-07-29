package com.javalab;

import java.util.Scanner;

public class BankingMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 조회");
			System.out.println("4. 종료");
			System.out.print("메뉴를 선택하세요:");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("입금 메뉴 선택");
			case 2:
				System.out.println("출금 메뉴 선택");
				break;
			case 3:
				System.out.println("조회 메뉴 선택");
				break;
			case 4:
				System.out.println("프로그램 종료");
				scanner.close();
				break;

			default:
				System.out.println("번호 잘못 입력");

			}
		}
	}
}
