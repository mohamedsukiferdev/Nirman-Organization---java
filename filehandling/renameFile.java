package filehandling;

import java.io.File;

public class renameFile {
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\mohamed sukifer\\Desktop\\mdd\\sk");
		File fileRename = new File("C:\\Users\\mohamed sukifer\\Desktop\\mdd\\suki");
		file.renameTo(fileRename);
		System.out.println("Renamed");
		
	}
	
}
