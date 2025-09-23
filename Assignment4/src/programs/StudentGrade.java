package programs;

public class StudentGrade {
	int mark1, mark2, mark3;
	static int total;

	public StudentGrade(int mark1, int mark2, int mark3) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	public String grade() {
		total = mark1 + mark2 + mark3;
		String grade;
		if (total >= 140)
			grade = "A";
		else if (total >= 100 && total < 140)
			grade = "B";
		else
			grade = "C";
		return grade;
	}

	public static void main(String[] args) {
		StudentGrade student1 = new StudentGrade(47, 50, 48);
		String gradeMark1 = student1.grade();
		System.out.println("The total marks of student1 is " + total + ". And the grade is " + gradeMark1 + ".\n");

		StudentGrade student2 = new StudentGrade(35, 40, 38);
		String gradeMark2 = student2.grade();
		System.out.println("The total marks of student2 is " + total + ". And the grade is " + gradeMark2 + ".");

	}

}
