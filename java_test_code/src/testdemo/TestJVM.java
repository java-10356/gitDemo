package testdemo;

import org.junit.Test;

public class TestJVM {
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		System.out.println(max);
	}
	@Test
	public void Test1(){
		System.out.println(Integer.MAX_VALUE);
	}
}
