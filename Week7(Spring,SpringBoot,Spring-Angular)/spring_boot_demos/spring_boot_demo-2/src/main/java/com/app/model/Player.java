package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Player {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String teamName;
	private String city;
}
