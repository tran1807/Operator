package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    System.out.print("nhập a = ");
    int a = sc.nextInt();
    System.out.print("nhập b = ");
    int b = sc.nextInt();
    int tong = a + b;
    System.out.println(b + " + " + a + " = " + tong);
     
    int hieu = a - b;
    System.out.println(a + " - " + b + " = " + hieu);
     
    int tich = a * b;
    System.out.println(a + " * " + b + " = " + tich);
     
    float thuong = a / b;
    System.out.println(a + " / " + b + " = " + thuong); 
    
    System.out.println("Kết quả so sánh lớn hơn 2 số : " + a + " và " + b + " là " + (a > b));
    System.out.println("Kết quả so sánh nhỏ hơn 2 số : " + a + " và " + b + " là " + (a < b));
    System.out.println("Kết quả so sánh lớn hơn hoặc bằng 2 số : " + a + " và " + b + " là " + (a >= b));
    System.out.println("Kết quả so sánh nhỏ hơn hoặc bằng 2 số : " + a + " và " + b + " là " + (a <= b));
    }
    
	}


