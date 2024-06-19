import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;
        
        do {
            System.out.println("Pilih Menu :");
            System.out.println("1. Tampilkan");
            System.out.println("2. Masukkan");
            System.out.println("3. Edit");
            System.out.println("4. Delete");
            System.out.println("0. Keluar");

            menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    Database.tampilkan();
                    break;
                case 2:
                    System.out.println("Masukkan Id Buku");
                    int bookId = scanner.nextInt();
                    System.out.println("Masukkan Judul Buku");
                    String bookTitle = scanner.next();
                    System.out.println("Masukkan Tahun Terbit Buku");
                    int publicationYear = scanner.nextInt();
                    System.out.println("Masukkan Jumlah Stok");
                    int stock = scanner.nextInt();
                    System.out.println("Masukkan Nama Penulis");
                    String author = scanner.next();
                    Database.masukkanBuku(bookId, bookTitle, publicationYear, stock, author);
                    break;
                case 3:
                    System.out.println("Masukkan Id Buku");
                    bookId = scanner.nextInt();
                    System.out.println("Masukkan Judul Buku");
                    String updatedTitle = scanner.next();
                    System.out.println("Masukkan Tahun Terbit Buku");
                    int updatedYear = scanner.nextInt();
                    System.out.println("Masukkan Jumlah Stok");
                    int updatedStock = scanner.nextInt();
                    System.out.println("Masukkan Nama Penulis");
                    String updatedAuthor = scanner.next();
                    Database.editBuku(bookId, updatedTitle, updatedYear, updatedStock, updatedAuthor);
                    break;
                case 4:
                    System.out.println("Masukkan Id Buku");
                    bookId = scanner.nextInt();
                    Database.deleteData(bookId);
                    break;
                case 0:
                    System.out.println("Exit Program....");
                    break;
            }
        } while (menuChoice != 0);
        scanner.close();
    }
}
