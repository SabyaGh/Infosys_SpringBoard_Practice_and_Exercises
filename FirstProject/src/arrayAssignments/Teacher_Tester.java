package arrayAssignments;

public class Teacher_Tester {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Alex","Java Fundamentals",1200L);
		Teacher t2 = new Teacher("john","RDBMS",800L);
		Teacher t3 = new Teacher("Sam","Networking",900L);
		Teacher t4 = new Teacher("Maria","Python",900L);
		Teacher[] newArray = new Teacher[4];
		newArray[0] = t1;
		newArray[1] = t2;
		newArray[2] = t3;
		newArray[3] = t4;
		
		for(int i = 0; i<newArray.length-1; i++) {
			System.out.print("Name:"+newArray[i].getTeacherName()+", ");
			System.out.print("Subject:"+newArray[i].getSubject()+", ");
			System.out.print("Salary:"+newArray[i].getSalary()+", ");
			System.out.println();
		}
	}

}
