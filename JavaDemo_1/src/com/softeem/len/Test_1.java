package com.softeem.len;

public class Test_1 {
	
	public static void main(String[] args) {
		boolean b = false ; // (true / false)
		
		byte by = -128;         // -128 ~ 127 (256)
		short sh = 32767;      // -32768~32767(65536)
		int i = 2147483647;    //-2147483648~2147483647
		long lo = 9223372036854775807L;//-9223372036854775808~9223372036854775807
		
		//所有带有小数点的数据都是(double双精度浮点型)
		
		float f = 3.14f ;//3.4028235E38
		double d = 3.14 ; //1.7976931348623157E308
		
		int ii = 0xa ;//表示为16进制
		System.out.println( ii );
		int jj = 012 ;//表示为8进制
		System.out.println( jj );
		
		char c = '\u0065'; //0~65535
		
		
		System.out.println( c );
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		
		System.out.println("\"aaa\"");
		System.out.println("\\");  
		System.out.println("\\t");
		
		
		float f2 = 3.14f ;
		long l2 = (long) f2 ;//强制转换
		
		f2 = l2 ;//自动转换
		
	}
	
}