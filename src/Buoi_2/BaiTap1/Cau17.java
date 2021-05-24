package Buoi_2.BaiTap1;

import java.util.Scanner;

public class Cau17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n;
		for(int i=0 ; ; i++) {
			double randomDouble = Math.random();
            randomDouble = randomDouble * 1000 + 1;
            int randomInt = (int) randomDouble;
            System.out.print(" vui long nhap gia tri n la \n");
            n = scanner.nextDouble();
            if( randomInt > n) {
            	System.out.print("\nso ban nhap lon hon so random\n35");
            }
            else {
            	System.out.print("\nso ban nhap nho hon so random");
            }
            if( randomInt == n) {
            	System.out.print("ban da doan dung voi gia tri random");
            	break;
            }
            
		}
	}	
	}
