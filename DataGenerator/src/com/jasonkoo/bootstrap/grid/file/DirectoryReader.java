package com.jasonkoo.bootstrap.grid.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DirectoryReader {
	private String imgDir;
	
	public DirectoryReader(String dir) {
		this.imgDir = dir;	
	}
	
	public List<String> list() {
		List<String> fileNames = new ArrayList<String>(); 
		File folder = new File(imgDir);
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			if(listOfFiles[i].isFile()) {
				fileNames.add(listOfFiles[i].getName());
			}
		}
		Collections.shuffle(fileNames);
		return fileNames;
	}
}
