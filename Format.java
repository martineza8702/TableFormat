//import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Format implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
static ArrayList<Job>jobs= new ArrayList<Job>();






public static void ReadfromJobsToRun(File Filename) throws NumberFormatException, IOException {
	Scanner FileScan= new Scanner(Filename);
	String kb="";
	//FileScan.useDelimiter(",");
	BufferedReader Reader = new BufferedReader(new FileReader("JobsToRun"));
	while((kb=Reader.readLine())!=null) {
		String [] data=kb.split(",");
		
		String name=data[0];
		Long entered=Long.parseLong(data[1]);
		Long burst=Long.parseLong(data[2]);
		FileScan.nextLine();
		jobs.add(new Job(name,entered,burst));
		
	}
	Reader.close();
	FileScan.close();
}

public static void print_jobs() {
	for(Job b: jobs) {
		System.out.println(b.toString());
}
}




	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		File file=new File("JobsToRun");
		ReadfromJobsToRun(file);

		/*Task task= new Task(jobs);
		Thread run= new Thread(task);
		run.start();
		*/
		/*
		Task_SJ_nonpreemptive task= new Task_SJ_nonpreemptive(jobs);
		Thread run= new Thread(task);
		run.start();
		*/
		
		class Format{
		{
	    JFrame f;
	    
	    JTable j;
	  
	    
	    Format()
	    {
	       
	        f = new JFrame();
	  
	     
	        f.setTitle("JTable Example");
	  
	        String[][] data = {
	            { "P1 ", "0", "0-15" },
	            { "P2", "15", "15-20" }
	        };
	  
	       
	        String[] columnNames = { "Job#", "TimeEntered", "TimeEnd" };
	  
	        
	        j = new JTable(data, columnNames);
	        j.setBounds(30, 40, 200, 300);
	  
	        
	        JScrollPane sp = new JScrollPane(j);
	        f.add(sp);
	        
	        f.setSize(500, 200);
	        
	        f.setVisible(true);
	    }
	  
	    
	    public void main(String[] args)
	    {
	        new Format();
	    }
	}
	}
	

}
