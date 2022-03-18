package com.lambda.programs;

class X{
	static int i=1111;
	
	static {
		i=i-- - --i;
	}
	{
		i=i++ + ++i;
	}
}
class B extends X{
	static {
		i=--i - i--;
	}
	{
		i=++i + i++;
	}
}

public class A {
	
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.i);
	}

}
