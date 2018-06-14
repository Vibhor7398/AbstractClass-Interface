package ques3;

import java.util.*;

public class Question3 {

	static String a, b;
	static int x, y;

	static void input() {
		Scanner s = new Scanner(System.in);
		a = s.next();
		b = s.next();
	}

	static void convertNumber() {
		x = Integer.parseInt(a);
		y = Integer.parseInt(b);
	}

	static int compareNumbers() {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}

	public static void main(String[] args) {

		input();
		convertNumber();
		System.out.println("The greater of the numbers is " + compareNumbers());
		
	}

}
