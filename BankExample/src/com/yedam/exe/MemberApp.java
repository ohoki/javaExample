package com.yedam.exe;

import java.util.Scanner;

public class MemberApp {
	Scanner sc = new Scanner(System.in);
	
	public MemberApp() {
		memberRun();
	}

	private void memberRun() {
		boolean flag = true;
		while(flag) {
			menu();
			String selectNo = sc.nextLine();
			
			switch(selectNo) {
			case "1" :
				break;
			case "2" :
				break;
			case "3" :
				break;
			case "4" :
				flag = false;
				break;
			}
		}
	}

	private void menu() {
		System.out.println("1. 계좌 조회 | 2. 입출금 | 3. 이체 | 4. 뒤로가기");
		
	}
	
	
}