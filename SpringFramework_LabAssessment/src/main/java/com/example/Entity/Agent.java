/*
 Program:Create Agent table with Agent I'd, agent name, agent commission (salary)and perform crud operation using spring framework.
 		 make program using seperate Dao layer
 Author :Rajshree Gaikwad
 Date   :	29 Dec 2022
 	*/



package com.example.Entity;


//declaring  pojo class
public class Agent 
{
	//declaring varriables
	private int A_Id;
	private String A_Name;
	private int A_Commission;
	
	//declaring NoArgs constructor
	public Agent() 
	{
		
		// TODO Auto-generated constructor stub
	}
	
	//declaring parameterized  constructor
	public Agent(int a_Id, String a_Name, int a_Commission) 
	{
		
		A_Id = a_Id;
		A_Name = a_Name;
		A_Commission = a_Commission;
	}

	//declaring getter setter method
	public int getA_Id() {
		return A_Id;
	}
	public void setA_Id(int a_Id) {
		A_Id = a_Id;
	}
	public String getA_Name() {
		return A_Name;
	}
	public void setA_Name(String a_Name) {
		A_Name = a_Name;
	}
	public int getA_Commission() {
		return A_Commission;
	}
	public void setA_Commission(int a_Commission) {
		A_Commission = a_Commission;
	}
}
//end of Agent Class
