package com.app.model;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//import AddClass.AddException;

public class AddClass implements AddInterface {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		

		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
				
		boolean a;		
		String filename;
		String s1;
		
		String p;
		String n=":\\";
		String dir;
		System.out.println("Enter the directory name to search(C,D,E): ");

		@SuppressWarnings("resource")
		Scanner pc=new Scanner(System.in);
		p=pc.nextLine();
		
		dir=p.concat(n);

		File fileDir = new File(dir);
		if(fileDir.isDirectory()){
			
			System.out.print("Enter file name with extension for creating :  ");
		@SuppressWarnings("resource")
		
		Scanner sc= new Scanner(System.in);
		s1=sc.nextLine();
		
	

			List<String> listFile1 = Arrays.asList(fileDir.list());
		
			a=listFile1.stream().anyMatch(s1::equalsIgnoreCase);
			
			   if(a==true) {
				   
				   System.out.println(s1+" file is already available...... please change the name\n\n");
				}
			   else {

		
		//String s2= "E:\\";
		filename=dir.concat(s1);
		
		try {
			fos=new FileOutputStream(filename);
			bos=new BufferedOutputStream(fos);
			String s="sample file for phase 1 project";
			byte b[]=s.getBytes();
			bos.write(b);
			System.out.println("Data written successfully");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				bos.flush();
				bos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}}
	else {
		System.out.println(fileDir.getAbsolutePath() +" is not a directory....please check the name\n\n");
	}

}}
