package com.sunbeam;

import java.util.Scanner;

public class SinglyLinearLinkedList {
	public static void main(String[] args) {
		List l = new List();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("0. Exit\n1. Add\n2. Delete First\n3. Delete Last\n4. Delete Position\n5. Display");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter number : ");
				int value = sc.nextInt();
				l.add(value);
				break;
			case 2:
				l.delFirst();
				break;
			case 3:
				l.delLast();
				break;
			case 4:
				System.out.println("Enter position : ");
				int pos = sc.nextInt();
				l.delPosition(pos);
				break;
			case 5:
				l.display();
				break;
			default:
				break;
			}
		}while(choice!=0);
	}
}
