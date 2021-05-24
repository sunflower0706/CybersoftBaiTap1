package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float x1,x2,y1,y2,modum;
		System.out.println("nhap gia tri cho A(x1,y1) la: ");
		System.out.println("x1\n");
		x1 = scanner.nextFloat();
		System.out.println("y1\n");
		y1 = scanner.nextFloat();
		System.out.println("nhap gia tri cho A(x2,y2) la: ");
		System.out.println("x2\n");
		x2 = scanner.nextFloat();
		System.out.println("y2\n");
		y2 = scanner.nextFloat();
		float t1,t2;
		t1=(float) Math.pow(x1-x2, 2);
		t2=(float) Math.pow(y1-y2, 2);
		modum = (float) Math.sqrt(t1+t2);
		System.out.printf("hia tri cua do dai doan ab la %f",modum);
	}

}
