/*
 Program:Create Agent table with Agent I'd, agent name, agent commission (salary)and perform crud operation using spring framework.
 		 make program using seperate Dao layer
 Author :Rajshree Gaikwad
 Date   :	29 Dec 2022
 	*/

package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Entity.Agent;
import com.example.Entity.AgentDao;

//declaring class
public class App 
{
	//calling main method
    public static void main( String[] args )
    {
    	
    	ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
    	AgentDao dao=(AgentDao)ap.getBean("a2");
    	
    	//for creating table
    	dao.createTable();
    	
    	//for printing table is created
       System.out.println( "Table is created" );
       
    	//for inserting values into Agent table
       	System.out.println(dao.saveAgent(new Agent(101,"Nia",40000)));
    	System.out.println(dao.saveAgent(new Agent(102,"Saurabh",50000)));
    	System.out.println(dao.saveAgent(new Agent(103,"Jaya",48000)));
    	System.out.println(dao.saveAgent(new Agent(104,"Kiran",56000)));
    	System.out.println(dao.saveAgent(new Agent(105,"Lavanya",34000)));
    	
    	
    	//for updating method
       	System.out.println(dao.updateAgent(new Agent(101,"Nia",49000)));
       	
       	
    	//for deleting method
    	System.out.println(dao.deleteAgent(new Agent(101,"Nia",49000)));
    	
        	
    	
    } //end of main method
} //end of class App
