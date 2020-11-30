package com.example.demo.config;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8282660884015685070L;

	private String name;

	private int age;
}
