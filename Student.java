package Oops;
 class Student{
  int rollno;
  String name;
  
  Student(int rno, String sname) // constructor
  {
	  rollno = rno;
	  name = sname;	  
  }
	 
  public void printStudent()
  {
	  System.out.println(rollno);
	  System.out.println(name);
  }
	 
	public static void main(String[] args) {
Student obj = new Student(11,"sai");
obj.printStudent();

	}

}