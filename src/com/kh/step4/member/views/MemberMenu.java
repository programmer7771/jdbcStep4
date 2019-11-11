package com.kh.step4.member.views;

import java.util.Scanner;

import com.kh.step4.member.controller.MemberController;
import com.kh.step4.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);

	public void displayMenu() {
		MemberController mc = new MemberController();
		
		do {
			System.out.println("\n *** 회원 관리 프로그램 *** \n");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 모든 회원 조회");
			System.out.println("3. 아이디로 회원 조회");
			System.out.println("4. 성별로 회원 조회");
			System.out.println("5. 암호 수정");
			System.out.println("6. 이메일 변경");
			System.out.println("7. 전화번호 변경");
			System.out.println("8. 주소 변경");
			System.out.println("9. 회원 탈퇴");
			System.out.print("번호 선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 : mc.insertMember(inputMember()); break;
				case 2 : mc.selectAll(); break;
				case 3 : mc.selectMember(inputMemberId()); break;
				case 4 : mc.selectGender(inputGender()); break;
				case 5 : mc.updatePassword(inputMemberId(), inputPassword()); break;
				case 6 : mc.updateEmail(inputMemberId(), inputEmail()); break;
				case 7 : mc.updatePhone(inputMemberId(), inputPhone()); break;
				case 8 : mc.updateAddress(inputMemberId(), inputAddress()); break;
				case 9 : mc.deleteMember(inputMemberId()); break;
				case 0 : return;
				default : System.out.println("잘못된 번호입니다. 다시 입력해주세요. \n");
				
			}
			
		}while(true);
		
	}
	
	public String inputMemberId() {
		System.out.print("회원 아이디 : ");
		sc.nextLine();
		return sc.nextLine();
	}
	
	public Member inputMember() {
		Member m = new Member();
		
		//회원 정보 입력 받아 Member 객체 값 변경(setter 이용) 
		
		
		
		return m;
	}
	
	public String inputGender() {
		System.out.print("조회할 성별 입력(남:M/여:F) : ");
		sc.nextLine();
		return sc.nextLine().toLowerCase();
	}
	
	public String inputPassword() {
		System.out.print("수정할 비밀번호 입력 : ");
		
		return sc.nextLine();
	}
	public String inputEmail() {
		System.out.print("수정할 이메일 입력 : ");
		
		return sc.nextLine();
	}
	public String inputPhone() {
		System.out.print("수정할 전화번호 입력 : ");
		
		return sc.nextLine();
	}
	public String inputAddress() {
		System.out.print("수정할 주소 입력 : ");
		
		return sc.nextLine();
	}
	

}





















