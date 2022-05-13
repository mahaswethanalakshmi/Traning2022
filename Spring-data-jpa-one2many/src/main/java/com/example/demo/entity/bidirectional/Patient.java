package com.example.demo.entity.bidirectional;

	

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity												
@Table(name = "maha_patient_one2many_bid")	



@Data
@AllArgsConstructor
@NoArgsConstructor
					
public class Patient {
	
	
	@Id
	@Column(name = "patient_id")
int patientId;
	
	@Column(name = "patient_name")
String patientName;
	
	@Column(name = "mobile_number")
long mobileNumber;


@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "doctor_ref")
private Doctor doctor;

}


