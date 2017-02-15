import java.util.Scanner;
public class Comparisons{
	
	public static void main(String[] args){
		
		
		Scanner scanman = new Scanner(System.in);
		
		System.out.println("Please give me three strings");
		
		String one = scanman.nextLine();
		String two = scanman.nextLine();
		String three = scanman.nextLine();
			
		System.out.println("This is the largest: ");
		System.out.println(Compare3.largest(one, two, three));
		
		System.out.println("Ok, let's try some integers. Give me three");
		
		Integer one1 = scanman.nextInt();
		Integer two2 = scanman.nextInt();
		Integer three3 = scanman.nextInt();
		
		System.out.println("This is the largest: ");
		System.out.println(Compare3.largest(one1, two2, three3));
		
	}
	
	
}