package com.Aggregation;
//class university
public class University
{
	//variable declaration
	int univcode;
	String univname;
	College college;
	
//constructor creation
public University(int univcode, String univname, College college) 
{
		
		this.univcode = univcode;
		this.univname = univname;
		this.college = college;
}
//method 
public void getUniversityDetails()
{
	System.out.println("University code is : "+univcode);
	System.out.println("University name is : "+univname);
	System.out.println("college coode  is : "+college.code);
	System.out.println("college clgname is : "+college.clgname);
	System.out.println("college collegeplace is : "+college.place);
}
//main
public static void main(String[] args) 
{
	//object for college
	College college=new College(9801,"AnnaUniversity","Chhenai");
	//object for university 
	University university=new University(4204,"APEC",college);
	//method calling
	university.getUniversityDetails();
	

	}

}
