package com.sunbeam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SinglyCircularTailLinkedList l = new SinglyCircularTailLinkedList();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("0. Exit\n1. Add\n4. Delete First\n5. Delete Last\n6. Delete Position\n7. Display");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter number : ");
				int value = sc.nextInt();
				l.addFirst(value);
				break;
			case 2:
				System.out.println("Enter number : ");
				value = sc.nextInt();
				l.addLast(value);
				break;
			case 3:
				System.out.println("Enter number : ");
				value = sc.nextInt();
				System.out.println("Enter position : ");
				int pos = sc.nextInt();
				l.addPosition(value,pos);
				break;
			case 4:
				l.delFirst();
				break;
			case 5:
				l.delLast();
				break;
			case 6:
				System.out.println("Enter position : ");
				pos = sc.nextInt();
				/*l.delPosition(pos);*/
				break;
			case 7:
				l.display();
				break;
			default:
				break;
			}
		}while(choice!=0);
	}
}
