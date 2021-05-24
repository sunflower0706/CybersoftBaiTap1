package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau7 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("vui long nhap gia tri cho bien n la ");
	int n;
	n = scanner.nextInt();
	System.out.printf("uoc so cua bien n la /n:");
	for(int i =0 ; i < n ; i++) {
		if(n%i == 0) {
			System.out.printf("%d/n",i);
		}
	}
}
}
