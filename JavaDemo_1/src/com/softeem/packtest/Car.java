package com.softeem.packtest;

public class Car {
	public String carbrand = "大众";
	public String carname = "辉腾";
	public int price = 700000 ;
	public String displacement = "2.5t" ;
	public String color = "黑色" ;
	
	//构造方法
	public Car(){
		
	}
	
	//显示汽车的信息
	public void showInfo(){
		System.out.println(carbrand);
		System.out.println(carname);
		System.out.println(price);
		System.out.println(displacement);
		System.out.println(color);
	}
	//启动
	public void start(){
		System.out.println("汽车启动");
	}
	//停止
	public void stop(){
		 System.out.println("汽车停止");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.carname = "速腾";
		c.price = 100000 ;
		c.showInfo();
		c.start();
		c.stop();
	}
}
