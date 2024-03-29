package edu.umb.cs680.hw7;

import java.util.LinkedList;

public class FileSystem {
	
	private static FileSystem instance = null;
	private LinkedList<Directory> rootDirectory = new LinkedList<Directory>();

	public static FileSystem getFileSystem() {
		if (instance == null)
			instance = new FileSystem();
		return instance;
	}
	
	public void addRootDir(Directory directory) {
		rootDirectory.add(directory);
	}

	public LinkedList<Directory> getRootDirs() {
		return this.rootDirectory;
	}

	
}