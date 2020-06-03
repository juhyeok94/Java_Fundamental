package java_20200603;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = new MemberDao();
		int num = 11;
		String name = "택진형";
		String addr = "미국";
		
		//MemberDto m = new MemberDto(num, name, addr);
		//계속 쓸거면 m 한번만 쓸거면 아래
		/*
		int resultCount = mdao.insert(new MemberDto(num, name, addr));
		if(resultCount == 1) {
			System.out.println("정상적으로 회원 가입이 되었습니다.");
		}else {
			System.out.println("오류...");
		}
		*/
		
		/*
		int resultCount = mdao.Update(new MemberDto(num, name, addr));
		if(resultCount == 1) {
			System.out.println("정상적으로 회원 수정이 되었습니다.");
		}else {
			System.out.println("오류...");
		}
		*/
		
		/*
		int resultCount = mdao.delete(num);
		if(resultCount == 1) {
			System.out.println("회원이 정상적으로 삭제이 되었습니다.");
		}else {
			System.out.println("오류...");
		}
		*/
		
		/*
		ArrayList<MemberDto> list = mdao.select();
		for(int i=0;i<list.size();i++) {
			MemberDto m = (MemberDto)list.get(i);
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();
			System.out.printf("%d, %s, %s %n",_num, _name, _addr);
		}
		System.out.println("=============================================");
		 */
		
		MemberDto mdto = mdao.select(num);
		if(mdto != null) {
			int _num = mdto.getNum();
			String _name = mdto.getName();
			String _addr = mdto.getAddr();
			System.out.printf("%d, %s, %s %n",_num, _name, _addr);
		} else {
			System.out.println("회원정보가 없습니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
}