package com.kh.step4.member.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.kh.step4.member.model.vo.Member;

public class MemberView {
	public void displayError(String code) {
		switch(code) {
			case "insert" : System.out.println("회원 가입 실패!"); break;
			case "update" : System.out.println("회원 정보 수정 실패!"); break;
			case "delete" : System.out.println("회원 탈퇴 실패!"); break;
			default : System.out.println("알 수 없는 에러 발생!"); break;
		}
	}
	public void display(ArrayList<Member> list) {
		for(Member m : list) {
			System.out.println(m);
		}
	}
	public void display(Member m) {
		System.out.println(m);
	}
	public void display(HashMap<String, Member> hmap) {
		Iterator<String> keyIter = hmap.keySet().iterator();
		
		while(keyIter.hasNext()) {
			System.out.println(hmap.get(keyIter.next()));
		}
	}
}





















