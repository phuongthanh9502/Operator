package basic.dev;

import java.text.DecimalFormat;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("Nhap a = ");
		int a = sc.nextInt();
		System.out.println("Nhap b = ");
		int b = sc.nextInt();
		int Tong = a + b;
		System.out.println("Tong cua a va b la: "+Tong);
		int Hieu = a - b;
		System.out.println("Hieu cua a va b la: "+Hieu);
		float Tich = a * b;
		System.out.println("Tich cua a va b la: "+Tich);
		float Thuong = (float) a / b;
		System.out.println("Thuong cua a va b la: "+decimalFormat.format(Thuong));
		{boolean c = a > b;
		System.out.println("Kết quả so sánh lớn hơn 2 số a va b la "+c);}
		{boolean c = a < b;
		System.out.println("Kết quả so sánh bé hơn 2 số a va b la "+c);}
		{boolean c = a >= b;
		System.out.println("Kết quả so sánh lớn hơn hoặc bằng 2 số a va b la "+c);}
		{boolean c = a <= b;
		System.out.println("Kết quả so sánh bé hơn hoặc bằng 2 số a va b la "+c);}
	
	}

}
