package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau14 {
	public static void xoaPhanTu(float[] array, int index, int n) {
		for(int i=index;i<n-1;i++ ) {
			array[i]=array[i+1];
		}
		n--;
	}
	public static void kiemTra(float[] array, int n) {
		for(int i=0 ; i<n-1 ; i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]==array[j])
					xoaPhanTu(array,j,n);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n ; 
		System.out.print("nhap gia tri cho bien n la ");
		n = scanner.nextInt();
	    while(n<0)    {
			System.out.print("vui long nhap lai bien n");
			n = scanner.nextInt();
		};
		float[] array = new float[n];
		for(int i =0 ; i< n; i++) {
			System.out.print("nhap gia tri thu"+i+"la \n");
			array[i] =  scanner.nextFloat();
		}
		kiemTra(array,n);

	}

}
