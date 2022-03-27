package com.Association;
//class 3 association
public class Association {

	public static void main(String[] args) {
		
		//object creation for both class 1 and class 2
		Student sc=new Student("abc");
		Professor pro=new Professor("xyz");
		//print statement
        System.out.println(sc.classroom()+" is super than "+pro.professor());

	}

}
