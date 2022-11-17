package com.git.vo;

import java.util.Objects;

public class Member {
	
	private String memberId;
	private String memberPw;
	private String memberName;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memberId, String memberPw, String memberName) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(memberId, memberName, memberPw);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(memberId, other.memberId) && Objects.equals(memberName, other.memberName)
				&& Objects.equals(memberPw, other.memberPw);
	}
	
	
}
