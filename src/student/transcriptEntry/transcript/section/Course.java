package student.transcriptEntry.transcript.section;

public class Course {
	private String courseName;
	private String courseCode;
	
	// package level
	Course(String cName, String cCode, Lecturer l){
		courseName = cName;
		courseCode = cCode;
	}
	
	public String getCourseName() { return courseName; }
	public String getCourseCode() { return courseCode; }
	
	@Override
	public String toString() {
		return " [ Course Name : " + courseName + "\t Course Code : "
				+ courseCode + " ]";
	}
}
