/*
 Program:Create Agent table with Agent I'd, agent name, agent commission (salary)and perform crud operation using spring framework.
 		 make program using seperate Dao layer
 Author :Rajshree Gaikwad
 Date   :	29 Dec 2022
 	*/

package com.example.Entity;

import org.springframework.jdbc.core.JdbcTemplate;

//declaring class (Dao layer)

public class AgentDao 
{
	//reference from jdbc Templates
	
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
	this.jdbcTemplate=jdbcTemplate;
	}
	
	//for table creating
	public int createTable()
	{
		
		String query="create table Agent(A_Id int primary key ,A_Name varchar(40),A_Commission int)";
		return jdbcTemplate.update(query);
		
	}
	
	//for inserting values into table
	 public int saveAgent(Agent a)
		{
			String query="insert into Agent values('"+a.getA_Id()+"','"+a.getA_Name()+"','"+a.getA_Commission()+"')";
			return jdbcTemplate.update(query);
			
		}
	 
	 //for updating values from table
	 public int updateAgent(Agent a)
	 {
		 String query="update Agent set A_Name='"+a.getA_Name()+"',A_Commission='"+a.getA_Commission()+"'where A_Id='"+a.getA_Id()+"'";
		return jdbcTemplate.update(query);
		 
	 }
	 
	//for deleting values from table
		public int deleteAgent(Agent a )
		{
			String query="delete from Agent where A_Id='"+a.getA_Id()+"'";
			return jdbcTemplate.update(query);
		}

} //end class AgentDao
	

