package com.example.services;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.example.entity.Customer;
import com.example.entity.LoanApplication;
import com.example.ifaces.CrudRepository;

public class CustomerService implements CrudRepository<LoanApplication> {

	private Connection con;

	public CustomerService(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int add(LoanApplication obj) {

		
		
		
		return 0;
	}

	@Override
	public List<LoanApplication> findAll() {
		
		List<LoanApplication> loan = new ArrayList<LoanApplication>();
		String sql = "SELECT * FROM MAHA_CUSTOMER2 MC , MAHA_LOANAPPLICATION2 ML where MC.CUSTOMER_ID = ML.CUSTOMER_ID_REF";
try (PreparedStatement pstmt = con.prepareStatement(sql)){
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		
		int customerId = rs.getInt("customer_id");
		String customerName = rs.getString("customer_name");
		long phoneNumber = rs.getInt("Phone_number");
		double creditScored = rs.getDouble("credit_Score");
		int applicationNumber = rs.getInt("Application");
		int customer_Id_ref = rs.getInt("customer_id_ref");
	    double loanAmount = rs.getDouble("Loan_Amount");
	    
       Customer customer = new Customer(customerId,customerName,phoneNumber,creditScored);
       LoanApplication loans = new LoanApplication( applicationNumber,customer,loanAmount);
       loan.add(loans);		
		
	}
} catch (SQLException e) {
e.printStackTrace();
}
		return loan;
	}

	@Override
	public int update(int Id, LoanApplication obj) {
		// TODO Auto-generated method stub
		return 0;
	}

}