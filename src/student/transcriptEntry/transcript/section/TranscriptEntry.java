package student.transcriptEntry.transcript.section;

public class TranscriptEntry {
	Student student;
	Section section;
	String grade;
	
	TranscriptEntry(Student student, Section section, String grade){
		if(student == null || section == null || grade == null) return;
		this.student = student;
		this.section = section;
		this.grade = grade;
	}
	
	public String getGrade() { return grade; }
	
	@Override
	public String toString() {
		return " [ " + section.getCourse().getCourseName() 
				+ " : " + section.getCourse().getCourseCode() 
				+ "\t Grade :  " + getGrade() + " ] \n";
	}
}
