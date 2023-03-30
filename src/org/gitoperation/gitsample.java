package org.gitoperation;

public class gitsample {

	private void print() {
System.out.println("Enter your name:pushpamathi");
	}

	private void add(int a,int b) {
		int c=a+b;
		System.out.println("sum of two number:"+c);
		
	}

	private void sub(int a1,int b1) {
int su=a1-b1;
System.out.println(su);
	}
	
	public static void main(String[] args) {
		gitsample gs=new gitsample();
		gs.add(10, 20);
	}
}

