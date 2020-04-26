package recursion;
import java.io.File;

public class FolderandFileRecursion {
	public static void main(String[] args) {
		getDirectoryandFileDetails("/Users/wilmirnicanor/Documents/ruby_nci");
	}
	
	public static void getDirectoryandFileDetails(String filePath) {
		File currentFileOrDir = new File(filePath);
		
		if(!currentFileOrDir.exists()) {
			return;
		}
		else if(currentFileOrDir.isFile()) {
			System.out.println("FILE : " + currentFileOrDir.getName());
			processData(currentFileOrDir.getName());
			return;
		}else {
			System.out.println("FOLDER : " + currentFileOrDir.getName());
			
			for(String currentFileOrDirName: currentFileOrDir.list()) {
				getDirectoryandFileDetails(currentFileOrDir + "/" + currentFileOrDirName);
			}
		
			
		}
	
	}
	
	public static void processData(String name) {
		System.out.println("Process data for : " + name);
	}
	
}
