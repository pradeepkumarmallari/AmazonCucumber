package reusableMethods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Logging {
	private FileWriter filewriter;
	private PrintWriter printWriter;
	Date date;
	public Logging() {
		// TODO Auto-generated constructor stub
		
		try {
			date=new Date();
			//String path="./src/test/java/testLogs/" +"TestLogs_"+date.getDate()+"-"+date.getMonth()+"-"+date.getYear()+".log";
			String path="./src/test/java/testLogs/" +"TestLogs_"+date.toString().replace(" ", "").substring(0, 8)+".logs";
			filewriter=new FileWriter(path,true);
			printWriter=new PrintWriter(filewriter);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public void logInfo(String content) {
		try {
			//bufferedWriter.write(content);
			printWriter.println(date.toString()+" [INFO] : "+content);
			
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	public void saveLogFileandClose() {
	
		try {
			printWriter.close();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
