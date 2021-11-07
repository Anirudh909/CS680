package edu.umb.cs680.hw7;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;


class FileSystemTest {
	LocalDateTime localTime = LocalDateTime.now();
	Directory root = new Directory(null, "root", 0, localTime);
	
	private String[] toStringArray(Directory d) {
		String[] dirInfo = { null, d.getName(), Integer.toString(d.getSize()), d.getCreationTime().toString() };
		return dirInfo;
	}
	
	@Test
	void testverifyDirectory() {
		String[] expected = { null, "root", "0", localTime.toString() };
		Directory actual = root;
		assertArrayEquals(expected, toStringArray(actual));
	}
	
	@Test
	void testverifySameFile() {
		FileSystem fone = FileSystem.getFileSystem();
		FileSystem fTwo = FileSystem.getFileSystem();
		assertSame(fone, fTwo);
	}

}