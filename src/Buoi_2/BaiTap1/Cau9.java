package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau9 {
	public static void kiemTra(int n) {
		Scanner scanner = new Scanner(System.in);
		for(int i =0;;i++) {
			if((n>10)&&(n<89)) {
				System.out.print("so ban da nhap hop le");
				break;
			}
			System.out.print("so ban da nhap ko hop le vui long nhap lai");
			n = scanner.nextInt();
		}
	}
	public static void trueFalse(int a, int b) {
		int temp1 = a/10;
		int temp2 = a%10;
		int temp3 = b/10;
		int temp4 = b%10;
		if((temp1 == temp3)||(temp1 == temp4)
		||(temp2 == temp3)||(temp2 == temp4)) {
			System.out.print("True");
		}
		else {
			System.out.print("False");
		}
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int a,b;
	a = scanner.nextInt();
	b = scanner.nextInt();
	kiemTra(a);
	kiemTra(b);
	trueFalse(a,b);
}
}
