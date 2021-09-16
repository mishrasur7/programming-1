import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Applicant[] applicantArray = new Applicant[4];

		System.out.print("Enter 1. name: ");
		String firstName = input.nextLine();
		System.out.print("Enter points: ");
		int firstPoint = Integer.parseInt(input.nextLine());

		System.out.print("Enter 2. name: ");
		String secondName = input.nextLine();
		System.out.print("Enter points: ");
		int secondPoint = Integer.parseInt(input.nextLine());

		System.out.print("Enter 3. name: ");
		String thirdName = input.nextLine();
		System.out.print("Enter points: ");
		int thirdPoint = Integer.parseInt(input.nextLine());

		System.out.print("Enter 4. name: ");
		String fourthName = input.nextLine();
		System.out.print("Enter points: ");
		int fourthPoint = Integer.parseInt(input.nextLine());

		Applicant a1 = new Applicant(firstName, firstPoint);
		Applicant a2 = new Applicant(secondName, secondPoint);
		Applicant a3 = new Applicant(thirdName, thirdPoint);
		Applicant a4 = new Applicant(fourthName, fourthPoint);

		applicantArray[0] = a1;
		applicantArray[1] = a2;
		applicantArray[2] = a3;
		applicantArray[3] = a4;

		System.out.println();
		System.out.print("Enter the minimum of required points: ");
		int minPoint = Integer.parseInt(input.nextLine());

		System.out.println("The following applicants achieved the minimum of " + minPoint + " points:");
		for (int i = 0; i < applicantArray.length; i++) {
			if (applicantArray[i].getPoints() >= minPoint) {
				System.out.println(applicantArray[i].getName() + ", " + applicantArray[i].getPoints() + " points");
			}

		}

	}

}
