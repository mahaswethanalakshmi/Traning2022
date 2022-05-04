package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;
import java.sql.*;
import java.time.LocalDate;
public class MemberRepository implements CrudRepository<Member> {

	private Connection con;
	
	

	
	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	public int add(Member obj) {

		int	rowAdd=0;
		String sql="insert mahamember2 values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1,obj.getMemberId());
			pstmt.setString(2,obj.getMemberName());
			pstmt.setString(3,obj.getMemberAddress());
			pstmt.setDate(4,Date.valueOf(obj.getAccountOpenDate()));
			pstmt.setString(5,obj.getMemberShipType());
			pstmt.setDouble(6,obj.getFeesPaid());
			pstmt.setDouble(7, obj.getMaxBookAllowed());
			pstmt.setDouble(8,obj.getPenaltyAmount());
  			//memberList.add(member); 			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<Member> findAll() {
		List<Member> memberList = new ArrayList<Member>();
		String sql = "select * from mahamember2";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int memberId = rs.getInt("MEMBER_ID");
				 String memberName = rs.getString("MEMBER_NAME");
				 String memberAddress = rs.getString("MEMBER_ADDRESS");
				//LocalDate accDate = accountOpenDate.toLocalDate();
				 Date accountopendate = rs.getDate("acc_open_date");
				 LocalDate accDate = accountopendate.toLocalDate();
				 
				 String memberShipType = rs.getString("MEMBERSHIP_TYPE");
				  double feesPaid = rs.getDouble("FEES_PAID");
				  int maxBookAllowed = rs.getInt("MAX_BOOK_ALLOWED");
				  double penaltyAmount = rs.getDouble("PENALTY_AMOUNT");
				  Member member = new Member(memberId,memberName,memberAddress,accDate,memberShipType,feesPaid,maxBookAllowed, penaltyAmount);
	    			memberList.add(member); 			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return memberList;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int Id, Member obj) {
		// TODO Auto-generated method stub
		return 0;
	}

}
