/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranquocchien_59130185_baitapjava.bai1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class NhanVien {
//Khai báo các thuộc tính
private String ten;
private String tuoi;
private String diachi;
private double luong;
private int tongsogiolam;
Scanner scanner = new Scanner(System.in);
NhanVien(){
}
public NhanVien(String ten, String tuoi, String diachi, double luong, int tongsogiolam) {
this.ten = ten;
this.tuoi = tuoi;
this.diachi = diachi;
this.luong = luong;
this.tongsogiolam = tongsogiolam;
}
String getTen(){
return ten;
}
void setTen(String ten){
this.ten=ten;
}
String getTuoi(){
return tuoi;
}
void setTuoi(String tuoi){
this.tuoi=tuoi;
}
String getDiaChi(){
return diachi;
}
void setDiaChi(String diachi){
this.diachi=diachi;
}
double getLuong(){
return luong;
}

int getTongSoGioLam(){
return tongsogiolam;
}
void setTongSoGioLam(int tongsogiolam){
this.tongsogiolam=tongsogiolam;
}
void inputInfo(){
Scanner sc=new Scanner(System.in);
System.out.print("Tên nhân viên: ");
ten=sc.nextLine();
System.out.print("Tuổi nhân viên: ");
tuoi=sc.nextLine();
System.out.print("Địa chỉ nhân viên: ");
diachi=sc.nextLine();
System.out.print("Lương nhân viên: ");
luong=sc.nextDouble();
System.out.print("Tổng số giờ làm của nhân viên: ");
tongsogiolam=sc.nextInt();
}
void printInfo(){
System.out.println("Thông tin chi tiết nhân viên:");
System.out.println("Tên nhân viên: "+ten);
System.out.println("Tuổi nhân viên: "+tuoi);
System.out.println("Địa chỉ nhân viên: "+diachi);
System.out.println("Lương nhân viên: "+luong);
System.out.println("Tổng số giờ làm của nhân viên: "+tongsogiolam);
System.out.println("Thưởng: "+tinhThuong());
System.out.println("Tổng lương: "+(luong+tinhThuong()));
}
double tinhThuong(){
double thuong;
if(tongsogiolam>=200)
thuong=luong*0.2;
else if(tongsogiolam>=100 && tongsogiolam<200)
thuong=luong*0.1;
else
thuong=0;
return thuong;
}
//    public static void main(String[] args){
//        NhanVien nv1=new NhanVien();
//        nv1.inputInfo();
//        nv1.printInfo();
//}

}