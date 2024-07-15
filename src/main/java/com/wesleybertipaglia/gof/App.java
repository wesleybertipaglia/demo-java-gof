package com.wesleybertipaglia.gof;

import com.wesleybertipaglia.gof.create.Singleton;

public class App {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
	}

}
