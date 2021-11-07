package edu.umb.cs680.hw7;

import java.time.LocalDateTime;

public class File extends FSElement {
	
	public File(Directory main, String name, int size, LocalDateTime createdTime) {
		super(main, name, size, createdTime);
		main.appendChild(this);
	}
	public boolean isFile() {
		return true;
	}
	public boolean isDirectory() {
		return false;
	}
	
}