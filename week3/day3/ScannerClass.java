package week3.day3;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your name");
	String nextLine = scan.nextLine();
	System.out.println("Name:"+nextLine);
	String[] split = nextLine.split(" ");
	System.out.println(split.length);
}
}
