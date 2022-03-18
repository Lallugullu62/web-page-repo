package com.lambda.programs;

public class LambdaTest implements Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Hello Lambda Expression");
	}
	public static void main(String[] args) {
		Drawable d = new LambdaTest();
		d.draw();
	}
	

}
