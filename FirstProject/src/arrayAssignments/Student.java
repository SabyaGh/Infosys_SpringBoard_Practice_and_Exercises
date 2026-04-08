package arrayAssignments;
/*
* Problem Statement
	The results of a mid-term assessment have been declared. 
	The marks scored by a student in different subjects are stored in an array.

	You need to find the corresponding grade for each subject 
	by implementing the class Student based on the class diagram and description
*/
public class Student {
	private int[] marks;
	private char[] grade;
	
	public Student(int[] marks) {
		this.marks= marks;
		grade = new char[marks.length];
	}
	
	public void findGrade() {
		
		for(int i = 0; i<marks.length; i++) {
			if(marks[i]>=92) {
				grade[i]='E';
			}
			else if(marks[i]>=85 && marks[i]<92) {
				grade[i] = 'A';
			}
			else if(marks[i]>=70 && marks[i]<85) {
				grade[i]='B';
			}
			else if (marks[i]>=65 && marks[i]<70) {
				grade[i] = 'C';
			}
			else if(marks[i]<65) {
				grade[i]='D';
			}
		}
	}
	
	
	public int[] getMarks() {
		return marks;
	}
	
	public void setMarks(int[] marks) {
		this.marks= marks;
	}
	public char[] getGrade() {
		return grade;
	}
	public void setGrade(char[] grade) {
		this.grade=grade;
	}

}
