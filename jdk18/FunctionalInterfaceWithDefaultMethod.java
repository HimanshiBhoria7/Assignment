package com.jdk18;

interface Animal{
	default void check() {
		System.out.println("This msg is from Default Keywords");
	}
}

@FunctionalInterface
interface Mal extends Animal{
	void call(String msg);
}

public class FunctionalInterfaceWithDefaultMethod implements Mal{

	@Override
	public void call(String msg) {
		System.out.println(msg);
	}
	public static void main(String args[]) {
		FunctionalInterfaceWithDefaultMethod fid = new FunctionalInterfaceWithDefaultMethod();
		fid.call("This msg is from Functional Interface");
		fid.check();
	}
	
	
	

	

}
