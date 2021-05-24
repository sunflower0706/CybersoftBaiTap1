package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau18 {
	public static void application(float cap, float itr, float mn) {
		int idem = 0;
		while(cap == mn) {
			cap *=(1+itr);
			idem++;
		}
		System.out.printf("so nam ban dat duoc so von mong muon la %f", idem);
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	float capital,interest,money;
	System.out.print("vui long nhap so von ban co la;\n");
	capital = scanner.nextFloat();
	System.out.print("vui long nhap lai suat ban muon ban muon co la;\n");
	interest = scanner.nextFloat();
	System.out.print("vui long nhap so tien ban muon co la;\n");
	money = scanner.nextFloat();
	application(capital,interest,money);
}
}
