package com.kh.step4.member.controller;

import com.kh.step4.member.model.vo.Member;
import com.kh.step4.member.views.MemberView;

public class MemberController {
	//MemberView 클래스에 작성한 display 메소드로 출력할 것
	//display 메소드로 출력할 필요 없는 내용은 간단히 콘솔에 직접 출력
	//에러메세지는 MemberView의 displayError()를 이용할 것
	private MemberView mView = new MemberView();

	//신규 회원 등록용 메소드
	public void insertMember(Member inputMember) {
		
	}
	
	//모든 회원 정보 조회용 메소드(ArrayList 이용할 것)
	public void selectAll() {
		
	}
	//아이디를 이용한 회원 정보 검색(Member 이용할 것)
	public void selectMember(String inputMemberId) {
		
	}
	//성별을 이용한 회원 정보 검색(HashMap<String, Member> 이용할 것, key는 memberId, value는 회원정보 )
	public void selectGender(String inputGender) {
		
	}
	//입력받은 아이디와 일치하는 회원의 비밀번호 변경
	public void updatePassword(String inputMemberId, String inputPassword) {
		
	}
	//입력받은 아이디와 일치하는 회원의 이메일 변경
	public void updateEmail(String inputMemberId, String inputEmail) {
		
	}
	//입력받은 아이디와 일치하는 회원의 전화번호 변경
	public void updatePhone(String inputMemberId, String inputPhone) {
		
	}
	//입력받은 아이디와 일치하는 회원의 주소 변경
	public void updateAddress(String inputMemberId, String inputAddress) {
		
	}
	//회원 정보 삭제용 메소드
	public void deleteMember(String inputMemberId) {
		
	}

}
