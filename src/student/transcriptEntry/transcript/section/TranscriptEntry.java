package student.transcriptEntry.transcript.section;

public class TranscriptEntry {
	Student student;
	Section section;
	String grade;
	
	TranscriptEntry(Student student, Section section, String grade){
		this.section = section;
		this.grade = grade;
		this.student = student;
	}
	
	public String getGrade() { return grade; }
	
	@Override
	public String toString() {
		return " [ " + section.getCourse().getCourseName() 
				+ " : " + section.getCourse().getCourseCode() 
				+ "\t Grade :  " + getGrade() + " ] \n";
	}
}
