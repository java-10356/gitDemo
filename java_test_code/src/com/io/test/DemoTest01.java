package com.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DemoTest01 {
	public static void main(String[] args) throws Exception {
		//读取键盘录入：要求死记。
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String line=null;
		while((line=br.readLine())!=null){
	 		if("over".equals(line))
	 			break;
	 			bw.write(line);
	 			bw.flush();
	 			System.out.println();
		}
	}
}
