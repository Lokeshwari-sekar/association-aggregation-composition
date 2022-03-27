package com.Composition;
//school class created

public class School
{
	//variable declaration
	int code;
    String name;
    Department department;

    //constructor creation
	public School(int code, String name, Department department)
	{
		super();
		this.code = code;
		this.name = name;
		this.department = department;
	}
	//method
	public void Display()
	{
		System.out.println("school code: "+code);
		System.out.println("school name: "+name);
		System.out.println("*************");
		System.out.println("department name: "+department.dprtname);
		System.out.println("department name: "+department.hodname);
		System.out.println("*************");
		System.out.println("student name: "+department.student.rollno);
		System.out.println("student name: "+department.student.name);
		System.out.println("student name: "+department.student.sec);
	}
public static void main(String[] args) 
{
	Student student=new Student(23, "thilak", 'A');
	Department department =new Department("Ece","raja", student);
	School school=new School(298, "ADC", department);
	school.Display();
}
}
