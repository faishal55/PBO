package tpbo;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("","","","");
        student.inputM();
        student.inputPs();

        System.out.println("Info:");
        student.printI();
        System.out.println("Total Pembayaran: " + student.hitungPembayaran());
    }
}
