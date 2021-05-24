package Buoi_2.BaiTap1;
import java.util.Scanner;
public class Cau2 {
	public static long chuyenDoiCoSoSangNhiPhan(long n) {
		long sum = 0, i=1, rem ;
		while(n > 0) {
			rem = n%2;
			sum += (i*rem);
			n = n/2;
			i *= 10;
		}
		System.out.printf("%d\n", sum);
		return sum ;
	}
	public static long chuyenDoiCoSoSangThapPhan(long n) {
		int p = 0;
	    int decNumber = 0;
	    while (n > 0)
	    {
	        decNumber += (n % 10) * Math.pow(2, p);
	        ++p;
	        n/=10;
	    }
	    System.out.printf("%d",decNumber);
	    return n;
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	long n;
	do {
		System.out.print("vui long nhap n = ");
		n = scanner.nextLong();
		}while(n <= 0);
	long sum = 0 ;
	sum = chuyenDoiCoSoSangNhiPhan(n);
	chuyenDoiCoSoSangThapPhan(sum);
	
}
}
