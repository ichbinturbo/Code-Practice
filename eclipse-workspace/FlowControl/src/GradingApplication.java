import java.util.Scanner;

public class GradingApplication {

	int maths;
	int physics;
	int chemistry;

	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		GradingApplication obj1 = new GradingApplication();
		obj1.mathsGrade();
		obj1.physicsGrade();
		obj1.chemistryhGrade();
		obj1.averageGrade();
	}
	// TODO Auto-generated method stub

	public void mathsGrade() {

		System.out.println("Please enter maths marks");
		int maths = scanner.nextInt();

		if (maths >= 35) {
			System.out.println("Pass!");

		} else {
			System.out.println("Fail!");
		}

	}

	public  void physicsGrade() {

		System.out.println("Please enter physics marks");
		int physics = scanner.nextInt();

		if (physics >= 35) {
			System.out.println("Pass!");

		} else {
			System.out.println("Fail!");
		}

	}

	public void chemistryhGrade() {

		System.out.println("Please enter chemistry marks");
		int chemistry = scanner.nextInt();

		if (chemistry >= 35) {
			System.out.println("Pass!");

		} else {
			System.out.println("Fail!");
		}

	}

	public void averageGrade() {
		int totalmarks = (maths + physics + chemistry);
		int average = totalmarks / 3;

		if (average <= 59) {
			System.out.println("Average grade of C");

		} else if (average <= 69) {
			System.out.println("Average grade of B");

		} else {
			System.out.println("Average grade of A");

		}

	}

}
