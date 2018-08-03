package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomerReflection {
	public static void main(String args[]) {
		Customer c1 = new Customer("Polo");
		System.out.println(c1);

		Class cc = c1.getClass();
		System.out.println(cc);

		System.out.println("List of Constructors");

		Constructor[] constructors = cc.getConstructors();
		for (Constructor c : constructors) {
			System.out.println(c);
		}

		System.out.println("List of Methods");
		Method[] methods = cc.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}

		System.out.println("List of declared Methods");
		Method[] decmethods = cc.getDeclaredMethods();
		for (Method m : decmethods) {
			System.out.println(m);
		}

		System.out.println("List of Fields");
		Field[] fields = cc.getFields();
		for (Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println("List of Declared Fields");
		Field[] decfields = cc.getDeclaredFields();
		for (Field f : decfields) {
			System.out.println(f);
		}
		
		
	}
}
