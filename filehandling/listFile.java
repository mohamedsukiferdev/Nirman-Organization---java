package filehandling;

import java.io.File;

public class listFile {
 public static void main(String[] args) {
	File file = new File("C:\\Users\\mohamed sukifer\\Desktop");
	for(String s :file.list()) {
		System.out.println(s);
	}
}
}
