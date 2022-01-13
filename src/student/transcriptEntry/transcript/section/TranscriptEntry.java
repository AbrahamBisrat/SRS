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
	
	// you will need to implement the depedency classes to figure out how to
	// override the toString method.
}
