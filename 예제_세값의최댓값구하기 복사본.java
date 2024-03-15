package JavaAlgorithm;

import java.util.Scanner;

public class 예제_세값의최댓값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 수 중 최댓값을 구합니다.");
		System.out.print("A :"); int A= stdIn.nextInt();
		System.out.print("B :"); int B= stdIn.nextInt();
		System.out.print("C :"); int C= stdIn.nextInt();
		
		int max = A;
		if (A<B) max = B;
		if (B<C) max = C;
		// if문은 선택구조이다.
		
		System.out.println("세 수 중 최댓값은"+max + "입니다.");
		
		stdIn.close();

	}

}
