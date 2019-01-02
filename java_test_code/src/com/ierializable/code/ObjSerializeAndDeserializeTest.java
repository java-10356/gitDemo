package com.ierializable.code;

import com.iserializable.Personal;

public class ObjSerializeAndDeserializeTest {
	public static void main(String[] args) {
		Personal p = new Personal();
		p.setAge(23);
		p.setCode(2011);
		p.setName("张三");
		
		Personal p1 = new Personal();
		p1.setAge(23);
		p1.setCode(2011);
		p1.setName("张三");
		
		System.out.println(p1.equals(p));
	}

}
