package Buoi_2.BaiTap1;
import java.util.*;
public class Cau19 {
public static void giaiBac2(float a, float b, float c) {
	System.out.printf("Phuong trinh co dang la %fx^2+%fx+%f=0",a,b,c);
	if(c==0) {
		System.out.printf("phuong trinh co hai nghiem la x=0 & x=%f", -b/a);
	}
	if(a==0) {
		giaiBac1(b,c);
	}
	if(a==0 && b==0 && c==0)
		System.out.print("erro");
	if(b==0) {
		a=-c/a;
		if(a<0)
			System.out.print("vo nghiem");
		System.out.printf("phuong trinh co nghiem kep la x=%f", Math.sqrt(a));
	}
	if( (a!=0) && (b!=0) && (c!=0) ) {
		float delta = 0 ;
		delta = (float) (Math.pow(b, 2)-4*a*c);
		if(delta == 0) {
			System.out.printf("phuong trrinh co nghiem kep la %f", -b/(2*a) );
		}
		if(delta < 0) {
			System.out.print("vo nghiem");
		}
		if(delta > 0) {
			delta = (float) Math.sqrt(delta);
			System.out.printf("phuong trinh co hai nghiem la x1=%f va x2=%f",
					(-b+delta)/2*a , 
					(-b-delta)/2*a);
		}
	}
}
public static void giaiBac1(float a, float b) {
	if(a==0) {
		System.out.print("phuong trinh vo nghiem");
	}
	else {
		System.out.printf("phuong trinh co nghiem la %f",-b/a);
	}
	if(b==0)
		System.out.print("phuong trinh vo so nghiem");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("vui long chon neu giai bac 1 la case 1 "
				+ "neu giai bac 2 la case2 \n");
		int n ; 
		n = scanner.nextInt();
		switch(n) {
		case 1:
			float e,d;
			System.out.print(" vui long nhap a la\n");
			e = scanner.nextInt();
			System.out.print(" vui long nhap b la\n");
			d = scanner.nextInt();
			giaiBac1(e,d);
		case 2: 
			float a,b,c;
			System.out.print(" vui long nhap a la\n");
			a = scanner.nextInt();
			System.out.print(" vui long nhap b la\n");
			b = scanner.nextInt();
			System.out.print(" vui long nhap c la\n");
			c = scanner.nextInt();
			giaiBac2(a,b,c);
		}
		
		
	}

}
