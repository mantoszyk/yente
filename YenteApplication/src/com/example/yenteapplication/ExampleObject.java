package com.example.yenteapplication;

public class ExampleObject {
	public int eger;
	public String cheese;
	
	public ExampleObject(int eger, String cheese){
		this.eger = eger;
		this.cheese = cheese;
	}
	
	public ExampleObject(){
		eger = 0;
		cheese="";
	}
	
	public String getCheese(){
		return cheese;
	}
	
	public void setCheese(String newSTring){
		cheese = newSTring;
	}
}
