package com.softeem.packtest;

//学生类
public class Student {
	// 定义属性
	public int stuid; // 学生学号
	public String stuname; // 学生姓名
	public String stusex; // 学生性别
	public String _email; 
	public String $phone ;

	// 构造器 (构造方法)
	// 构造方法的方法名与当前类的类名是一致的
	// 构造方法没有返回类型(void)
	// 当用户在调用当前类中的构造器时.如果此类中没有定义构造器.系统会为此类默认定义一个
	// 无参数的构造器,供你使用
	public Student() {
		System.out.println("学生类构造器执行了!!!");
	}

	// 定义行为 (方法)
	public void study() {
		System.out.println("学生爱学习");
	}

	/**
	 * 此方法表示学生玩游戏方法
	 * 
	 * @author Pei
	 */
	public void playGame() {

		System.out.println("学生爱玩游戏");

	}

	/**
	 * 入口方法
	 * @param args  一个数组
	 * @author pei
	 * @version 1.0
	 * @return 无
	 */
	public static void main(String[] args) {
		// new关键字调用Student()构造方法,并且会返回一个学生类对象:stu
		Student stu = new Student();
		stu.study();// 调用study方法
		stu.playGame();// 调用playGame方法
		stu.stuid = 10;
		stu.stuname = "小明";
		stu.stusex = "男";
		stu.$phone = "123";
		System.out.println(stu.stuid);
		System.out.println(stu.stuname);
		System.out.println(stu.stusex);
	}
}
