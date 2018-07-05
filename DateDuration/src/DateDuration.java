import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDuration {

}

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int myBirthYear, myBirthMonth, myBirthDay, spouseBirthYear, spouseBirthMonth, spouseBirthDay;

		// input for user's date of birth

		System.out.print("Enter the year you were born: ");

		myBirthYear = sc.nextInt();

		System.out.print("Enter the month you were born: ");

		myBirthMonth = sc.nextInt();

		System.out.print("Enter the day you were born: ");

		myBirthDay = sc.nextInt();

		// input for spouse's date of birth

		System.out.print("Enter the year your spouse was born: ");

		spouseBirthYear = sc.nextInt();

		System.out.print("Enter the month your spouse was born: ");

		spouseBirthMonth = sc.nextInt();

		System.out.print("Enter the day your spouse was born: ");

		spouseBirthDay = sc.nextInt();

		// converting above data to LocalDate format

		LocalDate date1 = LocalDate.of(myBirthYear, myBirthMonth, myBirthDay);

		LocalDate date2 = LocalDate.of(spouseBirthYear, spouseBirthMonth, spouseBirthDay);

		// calculating and printing output

		System.out.print("Number of days you and your spouse's birthday! ");

		long days = ChronoUnit.DAYS.between(date1, date2);

		if (days < 0)

			days = days * -1;

		// int days = DAYS.between(date1, date2).getDays();

		System.out.println(days);

	}

}