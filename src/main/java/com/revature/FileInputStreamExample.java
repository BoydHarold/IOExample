package com.revature;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamExample {
	File file = new File("TestFile.txt");
	
	public void fileInputStreamExample() {
		try
		(
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		) {
			String line = "";
			//the br.readLine() method reads from the file line by line. I am assigning that String value to the variable line.
			//when line is null, it breaks out of the while loop. Each time it iterates though, it overwrites the String to the
			//line variable
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}
}
