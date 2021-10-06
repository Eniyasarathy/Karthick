package org.base;

public class Practise5 {

	public static void main(String[] args) { 
		System.out.println("||||start");
		try {
			System.out.println(10/0);
			String name=null;
			int i = name.length();
			System.out.println(i);}catch(NullPointerException n) {
				System.out.println("null");
			}catch(ArithmeticException a){

					System.out.println("end");


				}
			}
	}
























