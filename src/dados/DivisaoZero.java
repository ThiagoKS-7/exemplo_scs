package dados;

import java.util.Scanner;
import javax.swing.*;

public class DivisaoZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digita o numero A: ");
		int a = sc.nextInt();
		System.out.print("Digita o numero B: ");
		int b = sc.nextInt();
		try {			
			double c = a/b;
			System.out.println("Div 0: " + c);
		} catch (ArithmeticException arithmeticException){
			System.out.println("Erro, divisao por zero nao existe.");
		}
	}

}
