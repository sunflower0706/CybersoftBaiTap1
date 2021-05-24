package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau13 {
	public static void avr(float[] array, int n) {
		float avr=0;
		for(int i=0 ; i<n;i++) {
			avr+=array[i];
		}
		avr=avr/n;
		System.out.printf("gia tri trung binh la %f", avr);
	}
	public static void max(float[] array, int n) {
		float max =array[0];
		for(int i =0 ; i<n; i++) {
			if(array[i]>max)
				max=array[i];
		}
		System.out.printf("gia tri max la %f", max);
	}
	public static void min(float[] array, int n) {
		float min =array[0];
		for(int i =0 ; i<n; i++) {
			if(array[i]<min)
				min=array[i];
		}
		System.out.printf("gia tri max la %f",min);
	}
	public static void minAm(float[] array, int n) {
		float min=0 ;
		for(int i=0; i<n ;i++) {
			if(array[i]<0) {
				min = array[i];
				break;
			}
		}
		for(int i =0 ; i<n; i++) {
			if(array[i]  < min )
				min=array[i];
		}
		System.out.printf("gia tri max la %f",min);
	}
	public static void maxAm(float[] array, int n) {
		float max=0 ;
		for(int i=0; i<n ;i++) {
			if(array[i]<0) {
				max = array[i];
				break;
			}
		}
		for(int i =0 ; i<n; i++) {
			if((array[i] > max ) &&(array[i] <0) ) {
				max=array[i];
		}
		System.out.printf("gia tri max la %f",max);
		}
	}
	public static void maxDuong(float[] array, int n) {
		float max=0 ;
		for(int i=0; i<n ;i++) {
			if(array[i]>0) {
				max = array[i];
				break;
			}
		}
		for(int i =0 ; i<n; i++) {
			if((array[i] > max ) &&(array[i] >0) ) {
				max=array[i];
		}
		System.out.printf("gia tri max la %f",max);
		}
		}
	public static void minDuong(float[] array, int n) {
		float min=0 ;
		for(int i=0; i<n ;i++) {
			if(array[i]>0) {
				min = array[i];
				break;
			}
		}
		for(int i =0 ; i<n; i++) {
			if((array[i] < min ) &&(array[i] >0) ) {
				min=array[i];
		}
		System.out.printf("gia tri max la %f",min);
		}
		}
	public static void inChan(float[] array, int n) {
		for(int i =0 ; i<n ; i++) {
			if( array[i] %2 == 0)
				System.out.printf("%f\n", array[i]);
		}
	}
	public static void iLe(float[] array, int n) {
		for(int i =0 ; i<n ; i++) {
			if( array[i] %2 != 0)
				System.out.printf("%f\n", array[i]);
		}
	}
	public static void xoaPhanTu(float[] array, int index, int n) {
		for(int i=index;i<n-1;i++ ) {
			array[i]= array[i+1];
		}
		n--;
	}
	public static void themPhanTu(float[] array, int index, int n, float x) {
		for(int i=n-1;i<= index;i-- ) {
			array[i+1]= array[i];
		}
		array[index]=x;
		n++;
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

	}

}
