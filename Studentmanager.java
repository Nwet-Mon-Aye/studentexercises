package studentexe;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Studentmanager {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String res = null;
		do {
		
		System.out.println("Enter name");
		String n=s.nextLine();
		System.out.println("Enter phno");
		String ph=s.nextLine();
		System.out.println("Enter rollno");
		String rno=s.nextLine();
		System.out.println("Enter address");
		String add=s.nextLine();
		
		Student stu=new Student(n,ph,rno,add);
		
		
		
		ArrayList<Student> student = new ArrayList<>(); 
		student.add(stu);
		
		
		try {
			BufferedWriter write=new BufferedWriter(new FileWriter("stulist",true));
			PrintWriter w=new PrintWriter(write);
			
			w.println(student);
			w.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		BufferedReader br=new BufferedReader(new FileReader("stulist"));
		String resu;
		while((resu=br.readLine())!=null) {
			System.out.println(resu);
		}
		


		
		
		
		}while(res!="y");
		
		
		
	}

}
