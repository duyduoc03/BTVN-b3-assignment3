package sesstion3.Assignment3;

import java.util.Scanner;

public class User {
    String name,email,phone;
    int age;
    double sotien;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSotien() {
        return sotien;
    }

    public void setSotien(double sotien) {
        this.sotien = sotien;
    }

    Scanner sc = new Scanner(System.in);

    public void TT(){
        System.out.println("Nhập Tên: ");
        name = sc.nextLine();
        System.out.println("Nhập Email: ");
        email = sc.nextLine();
        System.out.println("Nhập Số Điện Thoại: ");
        phone = sc.nextLine();
        System.out.println("Nhập Tuổi: ");
        age = sc.nextInt();
        System.out.println("Nhập Số Tiền Hiện Có: ");
        sc.nextLine();
        sotien = sc.nextDouble();
    }
    public void IN(){
        System.out.println("Tên:\t\t\t\t" + name);
        System.out.println("Email:\t\t\t\t" + email);
        System.out.println("Số Điện Thoại:\t\t" + phone);
        System.out.println("Tuổi:\t\t\t\t" + age);
        System.out.println("Số Tiền Hiện Có:\t" + sotien);
    }
    public void IN(String ten, String mail, String dt, int tuoi, double tien){
        System.out.println("Tên:\t\t\t\t" + ten);
        System.out.println("Email:\t\t\t\t" + mail);
        System.out.println("Số Điện Thoại:\t\t" + dt);
        System.out.println("Tuổi:\t\t\t\t" + tuoi);
        System.out.println("Số Tiền Hiện Có:\t" + tien);
    }
}
