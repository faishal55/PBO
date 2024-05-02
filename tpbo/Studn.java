package tpbo;
import java.util.Scanner;

class Student extends Person {
    double spp;
    double sks;
    double modul;
    String nim;

    public Student(String name, String address, String hobi, String nim){
        super(name, address, hobi);
        this.nim = nim;
    }

    public String getNIm(){
        return nim;
    }

    public void inputM() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        name = scanner.nextLine();
        System.out.print("Alamat: ");
        address = scanner.nextLine();
        System.out.print("NIM: ");
        nim = scanner.nextLine();
        System.out.print("Hobi: ");
        hobi = scanner.nextLine();
    }

    public void inputPs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("SPP : ");
        spp = scanner.nextDouble();
        System.out.print("SKS : ");
        sks = scanner.nextDouble();
        System.out.print("Modul : ");
        modul = scanner.nextDouble();
    }
    public double hitungPembayaran() {
        return spp + (sks * 250000) + modul;
    }

    

    public void printI() {
        System.out.println("Nama : " + name);
        System.out.println("Alamat : " + address);
        System.out.println("NIM: " + nim);
        System.out.println("Hobi :" + hobi);
    }

}