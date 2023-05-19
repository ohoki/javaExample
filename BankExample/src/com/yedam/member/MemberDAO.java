package com.yedam.member;

import com.yedam.common.DAO;

public class MemberDAO extends DAO {
	private static MemberDAO memberDao = null;
	
	private MemberDAO() {
		
	}
	
	public static MemberDAO getInstance() {
		if(memberDao == null) {
			MemberDAO memberDao = new MemberDAO();
		}
		return memberDao;
	}
	
	//로그인 기능
	public Member login(String id) {
		Member member = null;
		
		try {
			conn();
			String sql = "SELECT * FROM member WHERE member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member();
				member.setMemberId("member_id");
				member.setMemberName("member_name");
				member.setMemberPw("member_pw");
				member.setMemberAuth("member_auth");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return member;
	}
}
