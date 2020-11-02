public class Course implements Cloneable{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents = 0;

	public Course(String courseName){
		this.courseName = courseName;
	}

	public void addStudent(String student){
		students[numberOfStudents] = student;
		numberOfStudents ++;
	}

	public String[] getStudents(){
		return students;
	}

	public int getNumberOfStudents(){
		return numberOfStudents;
	}

	public void dropStudent(String student){
		for (int i = 0; i < students.length; i ++){
			if (students[i] == student){
				students[i] = null;
				numberOfStudents --;
			}
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		Course courseClone = (Course) super.clone();
		courseClone.students = students.clone();
        return courseClone;
	}

	public void printStudents(){
		System.out.print("Students who take this course are ");
		for (int n = 0; n < numberOfStudents; n ++){
			System.out.print(students[n] + " ");
		}
		System.out.println(".");
	}

	/*
	@Override
	public Object clone(){
		try{
			Course courseClone = (Course)super.clone();
			courseClone.students = students.clone();
			return courseClone;
		}
		catch (CloneNotSupportedException ex){
			return null;
		}
	} */

}