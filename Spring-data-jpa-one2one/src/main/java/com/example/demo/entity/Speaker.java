package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity												
@Table(name = "speaker_one_to_one2")	



@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Speaker {
   @Id
   @Column(name = "speaker_id")
	int id;
   @Column(name = "speaker_firstname")
	String firstName;
   @Column(name = "speaker_qualification")
	String qualification;
	
}
