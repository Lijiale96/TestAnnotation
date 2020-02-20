package com.bjsxt.test.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * ʹ�÷����ȡע�����Ϣ��ģ�⴦��ע����Ϣ������
 * @author A
 *
 */
public class Demo03 {

	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		try {
			Class clazz = Class.forName("com.bjsxt.test.annotation.SxtStudent");
			
			//������������Чע��
			Annotation[] annotations = clazz.getAnnotations();
			for (Annotation a : annotations) {
				System.out.println(a);
			}
			//��ȡ���ָ����ע��
			SxtTable st =(SxtTable) clazz.getAnnotation(SxtTable.class);
			System.out.println(st.value());
			
			//�����������Ե�ע��
			Field g = clazz.getDeclaredField("id");
			SxtField sxtField = g.getAnnotation(SxtField.class);
			System.out.println(sxtField.columnName()+"--"+sxtField.type()+"--"+sxtField.length());
			
			Field f = clazz.getDeclaredField("studentName");
			SxtField sxtField1 = f.getAnnotation(SxtField.class);
			System.out.println(sxtField1.columnName()+"--"+sxtField1.type()+"--"+sxtField1.length());
			
			Field h = clazz.getDeclaredField("age");
			SxtField sxtField2 = h.getAnnotation(SxtField.class);
			System.out.println(sxtField2.columnName()+"--"+sxtField2.type()+"--"+sxtField2.length());
			
			//���ݻ�õı������ֶε���Ϣ��ƴ��DDL��䣬Ȼ��ʹ��JDBCִ�����SQL�������ݿ������ɵ���صı�
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
