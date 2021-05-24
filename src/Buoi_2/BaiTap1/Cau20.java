package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau20 {
	public static void xoaMang(float[] array, int index, int n) {
		for(int i=index;i<n-1;i++ ) {
			array[i]=array[i+1];
		}
		n--;
	}
	public static void nhapMang(float[] array1, float[] array2, int m, int n) {
		for(int i=0 ; i < m; i++)
			for(int j=0 ; j<n ; j++) {
				if( array1[j]%2 == 0 ) {
					array2[i] = array1[j];
					xoaMang(array1, j,n);
				}
			}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = 0;
		float[] array = new float[n];
		for(int i=0 ; i< n; i++) {
			System.out.print("nhap gia tri cho mang thu"+(i+1)+"la \n");
			array[i] = scanner.nextFloat();
			if(array[i]%2 == 0)
				m++;
		}
		float[] array2 = new float[m];
		nhapMang(array,array2,m,n);
		
	}

}
