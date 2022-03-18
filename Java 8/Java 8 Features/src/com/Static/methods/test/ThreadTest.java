package com.Static.methods.test;

public class ThreadTest {
	public static void threadRun() {
		System.out.println("Thread run started ");
	}
	public static void main(String[] args) {
		Thread t = new Thread(ThreadTest::threadRun);
		t.start();
	}

}
