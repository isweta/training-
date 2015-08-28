package day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		File in = new File(
				"C:\\Users\\admin\\workspace\\MySample\\src\\day5\\file1.txt");
		File out = new File(
				"C:\\Users\\admin\\workspace\\MySample\\src\\day5\\out.txt");

		FileReader fin = new FileReader(in);
		FileWriter fout = new FileWriter(out);
		int c;
		while ((c = fin.read()) != -1) {
			fout.write(c);
		}

		fin.close();
		fout.close();

	}
	
}
