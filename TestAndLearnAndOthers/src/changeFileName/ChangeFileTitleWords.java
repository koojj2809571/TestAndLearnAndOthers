package changeFileName;

import java.io.File;

public class ChangeFileTitleWords {

	public static void main(String[] args) {
		String dir = "E:\\work\\before\\APCode\\flag_icon\\The PNGs";
		File file = new File(dir);
		File[] fileNames = file.listFiles();
		for (File filename : fileNames) {
//			System.out.println(filename.getName());
		}
		changeFileToNewName(dir,"Flag of ","");
	}
	
	private static void changeFileToNewName(String dir, String replacement, String target) {
		File folder = new File(dir);
		if (folder.exists() && folder.isDirectory()) {
			File[] files = folder.listFiles();
			String path = folder.getAbsolutePath();
			for (File childFile : files) {
				if (childFile.isFile() && childFile.getName().contains(replacement)) {
					String newName = childFile.getName().replace(replacement, "");
//					System.out.println(path + "\\" + newName);
					childFile.renameTo(new File(path + "\\" + newName));
				}
			}
		}
	}


}
