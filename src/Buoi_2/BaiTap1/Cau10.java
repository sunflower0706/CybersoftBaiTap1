package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau10 {
	public static void kiemTra(int a) {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("vui long nhap lai a la ");
			a = scanner.nextInt();
		}while(a<0);
	}
	public static void sumNguyenTo(int a) {
		int sum=0;
		for(int i=0; i< Math.sqrt(a); i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		System.out.printf("gia tri tong cac"
				+" so nguyen to la %d", sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n ;
		n = scanner.nextInt();
		kiemTra(n);
		sumNguyenTo(n);
	}

}
