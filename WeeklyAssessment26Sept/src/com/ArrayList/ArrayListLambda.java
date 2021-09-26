package com.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

interface Prime {
	void checkPrime(List<Integer> num);
}

public class ArrayListLambda {

	public static void main(String args[]) throws IOException {

		List<Integer> al = new ArrayList<Integer>();

		// adding ranraom values to list
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Numbers : ");
		for (int i = 0; i < 25; i++) {
			al.add(Integer.parseInt(bufferedReader.readLine()));
		}
		System.out.println("Prime Numbers are : ");
		Prime prime = (num) -> {
			for (int j = 0; j < 25; j++) {
				int result = 0;
				for (int i = 2; i <= al.get(j) / 2; i++) {
					if ((al.get(j) % i) == 0) {
						result = 1;
						break;
					}
				}
				if (result == 0) {
					System.out.println(al.get(j) + " This is a Prime Number");
				} else {
					System.out.println(al.get(j) + " Is not a  Prime");
				}
			}
		};
		prime.checkPrime(al);

	}
}