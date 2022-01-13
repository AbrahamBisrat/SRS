package student.transcriptEntry.transcript.section;

import java.util.ArrayList;
import java.util.List;

public class Lecturer {
	private String name;
	private String id;
	private List<Course> courses;
	
	// package level
	Lecturer(String name, String id){
		this.name = name;
		this.id = id;
		courses = new ArrayList<Course>();
	}
	
	public Course assignCourse(Course c) {
		courses.add(c);
		return c;
	}
	
	public boolean removeCourse(Course c) {
		if(courses.contains(c)) {
			courses.remove(c);
			return true;
		}
		return false;
	}
	
	public void clearCourses() { courses.clear(); }
	
	public String getName() { return name; }
	
	public String getId() { return id; }
	
	public List<Course> getCourses() { return courses; }
	
	@Override
	public String toString() {
		String coursesList = "";
		if(courses.size() == 0)
			coursesList = " No assigned Courses";
		for(Course c : courses) 
			coursesList += c + "\n";
		return " [ Lecturer Name : " + name + "\t>> Id : " + id + " ] \n"
				+ coursesList;
	}
}







