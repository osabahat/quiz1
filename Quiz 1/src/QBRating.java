import java.util.Scanner;

public class QBRating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of passing attempts: ");
		int att = sc.nextInt();
		System.out.print("Enter number of completions: ");
		int comp = sc.nextInt();
		System.out.print("Enter passing yards: ");
		int yds = sc.nextInt();
		System.out.print("Enter touchdown passes: ");
		int td = sc.nextInt();
		System.out.print("Enter interceptions: ");
		int intercept = sc.nextInt();
		
		double a = ((comp/att)-0.3)*5;
		double b = ((yds/att)-3)*0.25;
		double c = (td/att)*20;
		double d = 2.375-((intercept/att)*25);
		
		double passrate = ((a+b+c+d)/6)*100;
		
		System.out.printf("%2.1f", passrate);
	}
}
