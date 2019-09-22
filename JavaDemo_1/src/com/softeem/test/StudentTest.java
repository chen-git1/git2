package com.softeem.test;

import com.softeem.packtest.Student;//在使用不同包中的类时需要导包

//学生测试类
public class StudentTest {

	public static void main(String[] args) {
		
	    Student stu = new Student();
		stu.study();
		stu.playGame() ;
		
	}
}
