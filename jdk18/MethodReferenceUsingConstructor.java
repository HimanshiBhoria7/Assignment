package com.jdk18;

interface Bike1 {
	Engine rate(String msg);
}

class Engine {
	Engine(String msg) {
		System.out.println(msg);
	}
}

public class MethodReferenceUsingConstructor {
	public static void main(String args[]) {
		Bike1 bk = Engine::new;
		bk.rate("Message from Constructor Method Reference");
	}

}
