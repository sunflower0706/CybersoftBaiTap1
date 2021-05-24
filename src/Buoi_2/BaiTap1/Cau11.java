package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau11 {
	public static void kiemTra(int a) {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("vui long nhap lai a la ");
			a = scanner.nextInt();
		}while(a<0);
	}
	public static void findMax(int n) {
		for(int i = 0 ; i< Math.log(n); i++) {
			if((++i)>Math.log(n))
				System.out.printf("gia tri max la %d", i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();
		kiemTra(n);
		findMax(n);
	}

}
