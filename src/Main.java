import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			int num = sc.nextInt();
			printBinary(num);
		}
	}

	private static void printBinary(int num) {
		// TODO Auto-generated method stub
		ArrayList<Character> binary = new ArrayList<>();
		
		while (num>0) {
			char lastDigit = (char)((num % 2) + '0');
			binary.add(0, lastDigit);
			num = num >> 1;
 		}
		
		int compensate = binary.size() % 4;
		if (compensate > 0) 
			compensate = 4 - compensate;
		for (int i=0;i<compensate;i++) {
			binary.add(0, '0');
		}
		
		for (int i=0;i<binary.size()/4;i++) {
			for (int j=0;j<4;j++) {
				System.out.print(binary.get(i*4+j));
			}
			System.out.print(" ");
		}
		System.out.println();
	}

}
