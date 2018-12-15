package com.revature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileOutputStreamExample {
	//by default, this will store the file below the pom.xml file
	File file = new File("TestFile.txt");
	//to specify a different location, you have to list the full path to where you want it
	
	public void fileOutputStreamExample() {

	
	try
	(
			//the true part of the next line means it will append to the file instead of overwriting it
			FileOutputStream fos = new FileOutputStream(file, true);
			//the PrintStream takes a FileOutputStream object as an argument
			PrintStream ps = new PrintStream(fos);
	) {
		//the println mehtod of PrintStream is used to actually add to the file
		ps.println("WHATEVER IS HERE GETS ADDED TO THE FILE");
	} catch (FileNotFoundException e) {
		
	} catch (IOException e) {
		
	}
	
	
	}
}
