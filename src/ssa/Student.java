package ssa;


import java.util.ArrayList;
import java.util.Comparator;

public class Student {
    
    private static String id;
    private static String firstName;
    private static String lastName;
    private static String eyeColor;
    // = { "blue", "brown", "other" };
    private static String monthsEmployed;

    public Student() {

    }

    public Student(String id, String firstName, String lastName, String eyeColor, String monthsEmployed) {
	

    }

    private static ArrayList<Student> classRoster = new ArrayList<Student>();
    public static Student student = new Student();

    public static void main(String[] args) {
	
	printClassRoster();
	
    }
    
    public static void printClassRoster()
    {
	String[] students = { "001449, Karen, Reiter, blue, 10", 
		"343769, Shaquil, Timmons, brown, 11",
		"004014, Aisha, Covington, brown, 10", 
		"772223, Daniel, Kiros, brown, 3",
		"005255, Joe, Hill, brown, 13"
		,"306700, Li, Lui, brown, 12",
		"001212, Stephen, Rook, brown, 11",
		"009999, Steve, Ellwood, other, 2",
		"004444, Peter, Choi, brown, 2",
		"132617, Reuben, Turner, blue, 12",
		"267252, Dax, Richards, brown,  12",
		"006789, Arun, Soma, brown, 2",
		"229949, Mike, Sykes, brown, 13",
		"215296, Joshua, Franey, other, 27",
		"523420, Gabriel, Hamilton, black, 10",
		"474143, Jonathan, stafford, brown, 13",
		"005295, Kyle, Deen, blue, 2",
		"004400, Kevin, Tran, other, 12",
		"008888, Evan, Tizard, brown, 12",
		"001122, Michael, Clair, other, 12"};
	
	

	for (int i =0;i < students.length; i++) {

	    // split the string
	    String[] parts = students[i].split(",");
	    id = parts[0];
	    firstName = parts[1];
	    lastName = parts[2];
	    eyeColor = parts[3];
	    monthsEmployed = parts[4];
	    
	    // add students to the roster
	    Student.add(id, firstName, lastName, eyeColor, monthsEmployed);
	    
	    System.out.printf("%-6s  %-16s %-16s %-9s %6s\n", id, firstName, lastName, eyeColor, monthsEmployed);
	    
	    
	}
	
	
    }
    
 
    
    
    public static void add(String id, String firstName, String lastName, String eyeColor, String monthsEmployed)

    {
	// create the student and add into the list
	// String[] eyeColor = { "blue", "brown", "other"} ;
	Student student = new Student(id, firstName, lastName, eyeColor, monthsEmployed);
	
	classRoster.add(student);

    }

    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

	public int compare(Student s1, Student s2) {
	   String StudentName1 = Student.getFirstName();
	   String StudentName2 = Student.getFirstName();

	   //ascending order
	   return StudentName1.compareTo(StudentName2);

    }};
    
    
    
    
    
    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Student.id = id;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Student.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Student.lastName = lastName;
    }

    public static String getEyeColor() {
        return eyeColor;
    }

    public static void setEyeColor(String eyeColor) {
        Student.eyeColor = eyeColor;
    }

    public static String getMonthsEmployed() {
        return monthsEmployed;
    }

    public static void setMonthsEmployed(String monthsEmployed) {
        Student.monthsEmployed = monthsEmployed;
    }
    
    
    
}

