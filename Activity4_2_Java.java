package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity4_2_Java {

	public static void main(String[] args) throws IOException {
		
		try {
			// Create new file
			File file = new File("src/Utility/newfile.txt");
			boolean fStatus = file.createNewFile();
			if (fStatus) {
				System.out.println("File created sucessfully");
			} else {
				System.out.println("File already exist in this location");
			}
			
			//get the file object
			File fileUtil = FileUtils.getFile("src/Utility/newfile.txt");
			// read the file
			System.out.println("Data in file: "+FileUtils.readFileToString(fileUtil,"UTF-8"));
			// create directory
			File destDir = new File("resources");
			//copy file to directory
			FileUtils.copyDirectory(file, destDir);
			//get file from directory
			File newFile = FileUtils.getFile(destDir,"newfile.txt");
			//read data from file
			String newFileData = FileUtils.readFileToString(newFile,"UTF-8");
			//print it
			System.out.println("Data in file: "+newFileData);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}
