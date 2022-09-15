package com.java8;

public class ThreadCreation {
	
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable thread in run() method");
			}
		};
		new Thread(runnable).start();
		
		Runnable r1 = () -> System.out.println("th1");
		
		new Thread(r1).start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("th2");
			}
		}).start();
		
		new Thread(()-> System.out.println("th3")).start();
		
	}

}
