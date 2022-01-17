package studentRegistrationSystem;

import java.util.List;

public class Transcript {
	private Student student;
	private List<TranscriptEntry> entries; 
	
	Transcript(List<TranscriptEntry> te, Student s){ 
		student = s;
		entries = te;
	}
	
	public Student getStudent() { return student; }
	
	@Override public String toString() {
		if(entries == null || entries.isEmpty()) return "No data";
		StringBuilder sb = new StringBuilder("Transcript for ");
		
		Student student = entries.get(0).getStudent();
		sb.append(student.getName() + " : ");
		sb.append("\n\n");
		
		int len = "Course Name               Grade".length();
		sb.append("Section Number           Course Name           Grade\n");
		
		for(TranscriptEntry t : entries) {
			sb.append(sp(5) + t.getSection().getNumber()
					+ sp(15) + t.getSection().getName()
					+ sp(len - t.getSection().getName().length() - 6) + t.getGrade());
			sb.append("\n"); 
		}
		return sb.toString();
	}
	
	String sp(int x) {
		String s = "";
		for(int i = 0; i < x; i++)
			s += " ";
		return s;
	}
}
