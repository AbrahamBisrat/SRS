package studentRegistrationSystem;

public class TranscriptEntry {
	private Student student;
	private Section section;
	private String grade;
	
	TranscriptEntry() {}
	
	TranscriptEntry(Student student, Section section, String grade){
		this.section = section;
		this.grade = grade;
		this.student = student;
		
		student.setGrades(this);
		section.setGradeSheet(this);
	}
	
	public String getGrade() { return grade; }
	public Student getStudent() { return student; }
	public Section getSection() { return section; }
	
	@Override public String toString() {
		return "Student: " + student.getName() + "\n"
				+ "Course name: " + section.getName() + "\n"
				+ "Section number: " + section.getNumber() + "\n"
				+ "Grade: " + grade + "\n";
	}
}
