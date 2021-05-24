package Buoi_2.BaiTap1;

import java.util.Scanner;
public class Cau16 {
	public static void kiemTra(int n){
		n=n%19;
		switch(n) {
		case 3:
			System.out.print("day la nam nhuan");
			break;
		case 6:
			System.out.print("day la nam nhuan");
			break;
		case 9:
			System.out.print("day la nam nhuan");
			break;
		case 11:
			System.out.print("day la nam nhuan");
			break;
		case 14:
			System.out.print("day la nam nhuan");
			break;
		case 17:
			System.out.print("day la nam nhuan");
			break;
		default:
			System.out.print("day khong phai nam nhuan");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("vui long nhap nam la ");
		n = scanner.nextInt();
		kiemTra(n);
	}

}
