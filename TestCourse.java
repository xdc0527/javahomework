import java.util.Arrays;
public class TestCourse{
	public static void main(String[] args) 
	    throws CloneNotSupportedException{
		Course course_1 = new Course("Java Programming");
		course_1.addStudent("Zhang San");
		course_1.addStudent("Li Si");
		course_1.addStudent("Wang Wu");
		course_1.printStudents();
		
		Course course_2 = (Course) course_1.clone();
		course_2.dropStudent("Wang Wu");
		course_2.printStudents();
	}
}