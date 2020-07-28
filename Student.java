package studentexe;

import java.io.Serializable;

public class Student implements Serializable {
	String name;
	String phno;
	String rollno;
	String address;
	Student(String name,String phno,String rollno,String address){
		this.name=name;
		this.phno=phno;
		this.rollno=rollno;
		this.address=address;
		
	}
	 public String toString() {
	        return "Student{" +
	                "name='" + name + '\'' +
	                ", phno='" + phno + '\'' +
	                ", rollno=" + rollno +
	                ", address='" + address + '\'' +
	                "}\n";
		 
		
	    }
}
