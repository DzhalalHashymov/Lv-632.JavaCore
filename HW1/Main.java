package lesson1;
import java.util.Scanner;

import jdk.javadoc.internal.doclets.toolkit.taglets.SummaryTaglet;

import java.math.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�������� 1\n����� ����,�������� ����. ������ �����");
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		double perimeter = 2 * 3.14 * radius;
		double area = 3.14 * Math.pow(radius,2);
		System.out.printf("���  ��������: "+"%.2f", perimeter);
		System.out.printf("\n���� �����: "+"%.2f", area);
		
		//Task 2
		System.out.println("\n�������� 2\n�������� �� ��� �����:");
		String name = br.readLine();
		System.out.println("� ����� ��� �� ������ " + name + "?");
		String location = br.readLine();
		System.out.printf("���� " + name + " �� ����� ����� �� �� ����� � ��� " + location + ", ����)");
		
		//Task 3
		System.out.println("\n�������� 3\n��������� ������� ������: \n");
		System.out.println("����� �����: �����\n�������� ������ ���� �� �������: ");
		double price_c1 = scan.nextInt();
		System.out.println("�� ������� ������: ");
		double time_t1= scan.nextInt();
		System.out.println("����� �����: �������\n�������� ������ ���� �� �������: ");
		double price_c2 = scan.nextInt();
		System.out.println("�� ������� ������: ");
		double time_t2= scan.nextInt();
		System.out.println("����� �����: ������\n�������� ������ ���� �� �������: "
				+ "");
		double price_c3 = scan.nextInt();
		System.out.println("�� ������� ������: ");
		double time_t3= scan.nextInt();
		System.out.printf("����, ���� �� ������ � ���볿: " + price_c1 * time_t1+"\n"+ 
				"ֳ�� �� ������ � �������: " + price_c2 * time_t2+"\n"+
				"ֳ�� �� ������ � �����: " + price_c3 * time_t3+"\n"+
				"�������� ����: "+  (price_c1 * time_t1 + price_c2 * time_t2 + price_c3 * time_t3));	
	}
	

	
}
