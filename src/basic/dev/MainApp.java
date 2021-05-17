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
    int tong = a+b;
    int hieu = a-b;
    int tich = a*b;
    int thuong = a/b;
    System.out.print("tổng = "+tong+"\n"+"hiệu = "+hieu+"\n"+"tích = "+tich+"\n"+"thương = "+thuong+"\n");
    
    {boolean c = a > b;System.out.println(c);}
	{boolean c = a < b;System.out.println(c);}
	{boolean c = a >= b;System.out.println(c);}
	{boolean c = a <= b;System.out.println(c);}
    }
    
	}


