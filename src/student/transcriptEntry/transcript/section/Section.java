package student.transcriptEntry.transcript.section;

import java.util.ArrayList;
import java.util.List;

public class Section {
	private Course course;
	private Lecturer lecturer;
	private List<String> schedule;
	private List<Student> studentList;
	private List<TranscriptEntry> gradeSheet;
	
	Section(Course c, Lecturer l, List<String> s){
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
	
	public Lecturer getLecturer() { return lecturer; }
	
	public Course getCourse() { return course; }
	
	public List<String> getSchedule() { return schedule; }
	
	public List<Student> getStudents() { return studentList; }
	
	@Override
	public String toString() {
		String schedules = "";
		String students = "";
		
		if(schedule != null)
			for(String s : schedule)
				schedules += s + "  :  ";
		else
			schedules = "Something went wrong!";
		
		if(studentList.size() > 0)
			for(Student s : studentList)
				students += s;
		else if(studentList.size() == 0)
			students = "   >>>   No students enrolled in this class";
		
		return " [ Course : " + course.getCourseName() 
				+ " : " + course.getCourseCode()
				+ "\t Lecturer : " + lecturer.getName()
				+ " ]\n Schedule : " + schedules + " ] "
				+ "\n currently enrolled students list : \n"
				+ students;
	}
}
