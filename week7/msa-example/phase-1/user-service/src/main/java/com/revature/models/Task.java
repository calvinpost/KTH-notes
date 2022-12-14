package com.revature.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tasks")
@Data
public class Task {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

}
