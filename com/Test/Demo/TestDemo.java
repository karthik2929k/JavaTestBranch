package com.Test.Demo;

import java.util.Date;
import java.util.function.Supplier;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello karthik !");
		Supplier<Date> s= ()->new Date();
		Date d2=new Date();
		System.out.println(s.get());
	}
}
