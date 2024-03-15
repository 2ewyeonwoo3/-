package JavaAlgorithm;

import java.util.Scanner;

public class 연습_네값의최솟값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.println("네 값의 최솟값을 구합니다.");
		System.out.print("A값은?"); int A = stdIn.nextInt();
		System.out.print("B값은?"); int B = stdIn.nextInt();
		System.out.print("C값은?"); int C = stdIn.nextInt();
		System.out.print("D값은?"); int D = stdIn.nextInt();
		
		int min = A;
		if (A>B) min = B;
		if (B>C) min = C;
		if (C>D) min = D;
	
		
		System.out.println("네 값의 최솟값은"+min+"입니다");
		
		
		stdIn.close();
		
		

	}

}
