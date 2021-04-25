package soft8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P2 {
	public static void FileWriter() throws IOException {
		File f = new File("C:\\Users\\HY\\Desktop\\writer1.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write("안녕");
		bw.newLine();
		bw.write("테스트");
		bw.write("세번째11");
		bw.close();	

	}

	public static void FileRead() throws IOException {
		File f = new File("C:\\Users\\HY\\Desktop\\writer1.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));

		String readtxt;

		while ((readtxt = br.readLine()) != null) {
			System.out.printf("%s\n", readtxt);
		}
		br.close();

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter();
		FileRead();
	}

}
