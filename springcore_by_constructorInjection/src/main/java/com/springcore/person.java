package com.springcore;


import java.util.List;
import java.util.Set;


public class person {
	private int id;
	private String name;
	private address a;
	private List<String> l;
	
	
	
	 public person(int id, String name, address a,List<String> l) {
		 this.id=id;
		 this.name=name;	
		 this.a=a;
		 this.l=l;
		 
		 
	 }
	@Override
	public String toString() {
		return this.id+" : " + this.name+" : "+this.a+" - "+this.l;
	}
	 
		
	
	
	
}
