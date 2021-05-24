package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau21 {
	public static void tinhToan(int x1,int x2,int v1, int v2) {
		if((v1>v2)&&(x1>x2)) {
			System.out.print("hai con roi xa nhau mai mai");
		}
		if((v1<v2)&&(x1<x2)) {
			System.out.print("hai con roi xa nhau mai mai");
		}
		if(((v1<v2)&&(x1==x2))||((v1>v2)&&(x1==x2))) {
			System.out.print("hai con chao nhau o vach xuat phat va cu thu"
					+ "the roi xa nhau mai mai");
		}
		if((v1>v2)&&(x1<x2)) {
			System.out.print("hai con se gap nhau");
		}
		if((v1<v2)&&(x1<x2)) {
			System.out.print("hai con se gap nhau");
		}

	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float X1,X2,V1,V2;
		for(int i=0;;i++) {
			System.out.print("Nhap van toc cho ga chien 1 la\n");
			V1 = scanner.nextFloat();
			if((V1<1)&&(V1>1000)) {
				System.out.print("vui long nhap lai trong khoang (1,1000)");
				V1 = scanner.nextFloat();
			}
			System.out.print("Nhap van toc cho ga chien 2 la\n");
			V2 = scanner.nextFloat();
			if((V2<1)&&(V2>1000)) {
				System.out.print("vui long nhap lai trong khoang (1,1000)");
				V2 = scanner.nextFloat();
			}
			System.out.print("Nhap vi tri cho ga chien 1 la\n");
			X1 = scanner.nextFloat();
			if((X1<1)&&(X1>10000)) {
				System.out.print("vui long nhap lai trong khoang (1,10000)");
				X1 = scanner.nextFloat();
			}
			System.out.print("Nhap vi tri cho ga chien 2 la\n");
			X2 = scanner.nextFloat();
			if((X2<1)&&(X2>10000)) {
				System.out.print("vui long nhap lai trong khoang (1,10000)");
				X2 = scanner.nextFloat();
			}
			if((X1>1)&&(X1<10000)&&(X2>1)&&(X2<10000)
			&&(V1>1)&&(V1<1000)&&(V2<1000)&&(V2>1)) {
				break;
			}
	}
	}
}
