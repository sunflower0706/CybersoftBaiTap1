package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau4 {
public static void Sum (int a , int b)// int thi bi loi
{
	int sum =0;
	sum = a+b;
	System.out.printf("%d", sum);
}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a, b;
	a = scanner.nextInt();
	b = scanner.nextInt();
	Sum(a,b);
}
}
