package com.bjsxt.test.annotation;

@SxtAnnotation01
public class Demo02 {
	
	@SxtAnnotation01(age=19,studentName="�����",id=1001,
			schools={"���մ�ѧ","���տƼ���ѧ"})
    public void test() {  	
    }
	
	
	@SxtAnnotation02(value="aaaa")
	public void test2() {
		
	}
	
}
