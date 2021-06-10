package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin sinh vien");
		Student std = new Student();
		System.out.println("NHap vao ho ten: ");
		std.name = sc.next();
		System.out.println("NHap vao tuoi: ");
		std.age = sc.nextInt();
		System.out.println("NHap vao dia chi: ");
		std.address = sc.next();
		System.out.println("NHap vao sdt: ");
		std.phone = sc.next();
		System.out.println("NHap vao dtb: ");
		std.dtb = sc.nextDouble();
		
		System.out.println(std.name+" "+std.age+" "+std.address+" "+std.phone+" "+std.dtb);
	}
}
