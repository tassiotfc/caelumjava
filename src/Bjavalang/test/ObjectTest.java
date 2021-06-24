package Bjavalang.test;

import Bjavalang.classes.Conta;

public class ObjectTest {
	public static void main(String[] args) {
		Conta c1 = new Conta("Pedro", 1000, 11652, "11657");
		Conta c2 = new Conta("Lucas", 5000, 11652, "11657");
		System.out.println(c1.equals(c2));
	}
}
