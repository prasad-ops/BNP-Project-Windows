package com.app.model;

import java.io.File;
import java.util.Scanner;

public class DeleteClass {
	public void delete() {
		
		String s1;
		String filedelete;
		
		
		String p;
		String n=":\\";
		String s2;
		System.out.println("Enter the directory name to search(C,D,E): ");

		@SuppressWarnings("resource")
		Scanner pc=new Scanner(System.in);
		p=pc.nextLine();
		
		s2=p.concat(n);
		
		
		File fileDir = new File(s2);
		if(fileDir.isDirectory()){
		
		System.out.print("Enter file name with extension for deleting:  ");

		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		s1=sc.nextLine();
		
		
		filedelete=s2.concat(s1);


		try  
		{         
		File f= new File(filedelete);           
		if(f.delete())                     
		{  
		System.out.println(f.getName() + " is deleted");   
		}  
		else  
		{  
		System.out.println("deletion failed.....File not found");  
		}  
		}  
		catch(Exception e)  
		{  
		e.printStackTrace();  
		}  
	}
		else {
			System.out.println(fileDir.getAbsolutePath() +" is not a directory....please check the name\n\n");
		}
		}

}
