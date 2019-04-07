import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		System.out.println("how old are you");
		age = scanner.nextInt();
		if(age < 16) {
			System.out.println("you can't drive");
		}
		if(age < 18) {
			System.out.println("you can't vote or smoke");
		}
		if(age > 0) {
			System.out.println("you can't do drugs or get guns");
		}
	}
}
