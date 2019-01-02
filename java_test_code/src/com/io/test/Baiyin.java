package com.io.test;


public class Baiyin {

	public  static void main(String[] args) {
	//	InputStream huangjin=System.in;
		double huangjin=282d;
		double baiyin=3.38;
		double money=100*huangjin;
		double gain_h=1;
		double gain_b=0.01;
		double count_h=0;
		double count_b=0;
		count_h=money/huangjin*gain_h;
		count_b=money/baiyin*gain_b;
		System.out.println("黄金盈利："+count_h);
		System.out.println("白银盈利："+count_b+",购得白银数量（g）:"+money/baiyin);

	}
}
