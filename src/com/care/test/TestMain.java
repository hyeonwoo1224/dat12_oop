package com.care.test;

import com.care.zzz.*;
//*을 사용하면 해당 패키지 안의 모든 것들을 가져다 쓸 수 있다.

public class TestMain {

	public static void main(String[] args) {
		Test t = new Test();
		t.test();
		
		TestClass tc = new TestClass();
		tc.testClass();
		
		TestClass02 tc02 = new TestClass02();
		tc02.testClass02();
		
		
		
	}

}
