package com.yedam.exe;

import java.util.Scanner;

import com.yedam.member.MemberService;

public class Application {
	Scanner sc = new Scanner(System.in);
	MemberService ms = new MemberService();
	
	public Application() {
		start();
	}

	private void start() {
		while(true) {
			System.out.println("1. 로그인 | 2. 종료");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				if(MemberService.memberInfo == null) {
					ms.login();
				} else {
					if(MemberService.memberInfo.getMemberAuth().equals("N")) {
						new MemberApp();
					} else if(MemberService.memberInfo.getMemberAuth().equals("B")) {
						new AccoutApp();
					}
				}
			}else if(menu == 2) {
				System.out.println("은행 업무 종료");
				break;
			} else {
				System.out.println("선택한 메뉴가 없습니다!");
			}
		}
	}
}
