package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFiles {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter src file name");
			String srcFile = sc.nextLine();
			System.out.println("Enter dest file name");
			String destFile = sc.nextLine();
			// chain of i/o streams to read : Java App <--- BR <---- FR <---- text file
			try (BufferedReader br = new BufferedReader(new FileReader(srcFile));
					//Java App --> PW : buffer --> FW --> text file
					PrintWriter pw=new PrintWriter(new FileWriter(destFile))
					) {
				String line = null;
				while ((line = br.readLine()) != null) {
			//		System.out.println(line);
					pw.println(line);//stores the line data in PW's buffer					
				}
				System.out.println("end of copy....");
			} //JVM :pw.close --> flush --> FW --closes dest file
			//br.close --> fr.close --closes the src file 
			catch (Exception e) {
				System.out.println(e);
			}

		} //sc.close

	}

}
