package filehandling;

import java.io.File;

public class FileHandling {
	public static void main(String[] args) {
		
//		creating file
		File file = new File("C:\\Users\\mohamed sukifer\\Desktop\\mdd\\sk");
		if(file.exists()==false) {
			file.mkdirs();
			System.out.println("Created ");
		}else {
			System.out.println("Not Created");
			
		}

	}
}