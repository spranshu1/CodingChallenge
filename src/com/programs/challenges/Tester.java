package com.programs.challenges;

public class Tester {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("1");
		list.add("2");
		list.add("8");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		System.out.println("Print: List: \t\t" + list);
		System.out.println(".size(): \t\t\t\t" + list.size());
		System.out.println(".get(3): \t\t\t\t" + list.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + list.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + list.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + list.size());
		System.out.println("Print again: List: \t" + list);
	}

}
