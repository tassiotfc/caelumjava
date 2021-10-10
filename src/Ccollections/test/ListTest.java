package Ccollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Bjavalang.classes.Conta;

public class ListTest {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();
		Conta c1 = new Conta("Pedro", 1000, 11652, "11657");
		Conta c2 = new Conta("Lucas", 5000, 11652, "11657");
		contas.add(c1);
		contas.add(c2);
		System.out.println(contas);
		Collections.sort(contas);
		System.out.println(contas);
	}
}