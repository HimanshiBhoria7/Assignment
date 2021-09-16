package com.jdk18;

@FunctionalInterface
interface Mall{
	void call(String msg);
}

public class FunctionalInterfacePractice implements Mall {

	@Override
	public void call(String msg) {
		System.out.println(msg);
	}
	public static void main(String args[]) {
		FunctionalInterfacePractice fi = new FunctionalInterfacePractice();
		fi.call("This is the java Class");
	}

}
