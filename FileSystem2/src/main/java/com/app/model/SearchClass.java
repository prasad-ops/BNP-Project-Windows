package com.app.model;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchClass {
	public void search() {
		
		String p;
		String n=":\\";
		String dir;
		System.out.println("Enter the directory name to search(C,D,E): ");

		@SuppressWarnings("resource")
		Scanner pc=new Scanner(System.in);
		p=pc.nextLine();
		
		dir=p.concat(n);


		
		String filesearch;
		boolean a;
		

		
		File fileDir = new File(dir);
		if(fileDir.isDirectory()){
			
			System.out.println("Enter the File name to search: ");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			filesearch=sc.nextLine();

			List<String> listFile1 = Arrays.asList(fileDir.list());
		
			a=listFile1.stream().anyMatch(filesearch::equalsIgnoreCase);
		
	   if(a==true) {
				System.out.println(filesearch+" file is found and it is available in current directory\n\n");
			}
			else {
				System.out.println(" file not found\n\n");

			}
		
		
}
		else {
			System.out.println(fileDir.getAbsolutePath() +" is not a directory....please check the name\n\n");
		}
		}
}
