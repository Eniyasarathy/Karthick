package org.base;

public class Practise2 {
	int a = 20;
	public void add() {
		int a = 30;
		System.out.println("Local:"+a);
	}
	
public static void main(String[] args) {
	Practise2 e = new Practise2();
	System.out.println("instance:"+e.a);
	e.add();
}			

}
