package student.transcriptEntry.transcript.section;

import java.util.ArrayList;
import java.util.List;

public class Section {
	private Course course;
	private Lecturer lecturer;
	private List<String> schedule = new ArrayList<String>();
	private List<Student> studentList;
	// package level
	Section(Course c, Lecturer l, List<String> s){
		if(course == null || lecturer == null || schedule.size() == 0)
			return;
		course = c;
		lecturer = l;
		schedule = s;
		studentList = new ArrayList<Student>();
	}
	
	public Student assignStudent(Student s) {
		if(s == null) return null;
		studentList.add(s);
		return s;
	}
	
	public boolean removeStudent(Student s) {
		if(studentList.contains(s)) {
			studentList.remove(s);
			return true;
		}
		return false;
	}
	
	public void removeAllStudents() {
		studentList.clear();
	}
	
	public List<String> getSchedule() { return schedule; }
	public List<Student> getStudents() { return studentList; }
	
	
	// add implementation for students toSting()
	
	@Override
	public String toString() {
		String schedules = "";
		String students = "";
		
		for(String s : schedule)
			schedules += s + "  :  ";
		
		for(Student s : studentList)
			students += s;
		
		return " [ Course : " + course.getCourseName() 
				+ " : " + course.getCourseCode()
				+ "\t Lecturer : " + lecturer.getName()
				+ "\t Schedule : " + schedules + " ] "
				+ "\n Students currently enrolled : \n"
				+ students;
	}
}
