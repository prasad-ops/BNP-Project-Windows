package com.app.model;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("FILE HANDLING APP");
		System.out.print("-----------------\n\n");
		System.out.print("-----------------\n");
		
		//List<String> listFile = new ArrayList();

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("MENU");
			System.out.print("-----------------\n");
			System.out.print("1) File or Folder name in ascending order\n");
			System.out.print("2) Add File\n");
			System.out.print("3) Delete File\n");
			System.out.print("4) Search File\n");
			System.out.print("5) Exit \n");
			System.out.print("-----------------\n");
			System.out.print("-----------------\n\n");

			System.out.print("Enter the choice: ");
			ch=Integer.parseInt(sc.nextLine());
			
			switch (ch) {
			
			case 1:
				Display dis= new DisplayClass();
				dis.display();
				
				break;
			case 2:
				AddInterface a= new AddClass();
				a.add();
				break;
			case 3:
				DeleteClass dd=new DeleteClass();
				dd.delete();
				break;
			case 4:
				SearchClass ss=new SearchClass();
				ss.search();
				break;
		
			case 5:
				System.out.println("THANK YOU FOR USING THE APP");
				//delay(1000);
				
				System.exit(0);
				break;
				
			default:System.out.println("Invalid option..Try again");
			}
			
		}while(ch!=7);

	}

}
