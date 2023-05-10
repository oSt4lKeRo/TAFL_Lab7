package org.example;

import java.util.Scanner;

import static org.example.Helper.*;

public class Functional {

	public static void checkType_3(){



	}


	public static String[] inputRule(){
		String[] rule = new String[2];

		for(int i = 0; i < rule.length; i++) {
			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();
			rule[i] = s;
		}
		printRule(rule);
		return rule;
	}



}
