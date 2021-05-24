package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau12 {
	public static void kiemTra(int a) {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("vui long nhap lai a la ");
			a = scanner.nextInt();
		}while(a<0);
	}
	public static void inTamGiac(int n) {
		for(int i=1; i<=n ; i++) {
			for(int j=1 ; j<=i; j++) {
				System.out.printf("%d",i);
			}
			System.out.print("\n");
		}
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n;
	n = scanner.nextInt();
	kiemTra(n);
	inTamGiac( n);
}
}
