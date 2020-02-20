package com.bjsxt.test.annotation;

@SxtAnnotation01
public class Demo02 {
	
	@SxtAnnotation01(age=19,studentName="李家乐",id=1001,
			schools={"江苏大学","江苏科技大学"})
    public void test() {  	
    }
	
	
	@SxtAnnotation02(value="aaaa")
	public void test2() {
		
	}
	
}
