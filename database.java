import java.sql.*;

public class Database {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/perpus";
    static final String USER = "root";
    static final String PASS = "";

    static Connection connection;
    static Statement statement;
    static ResultSet resultSet;

    public static void tampilkan(){
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM buku");
            int counter = 1;
            while(resultSet.next())
            {
                System.out.println("\nData ke-" + counter);
                System.out.println("ID Buku: " + resultSet.getString("id"));
                System.out.println("Judul Buku: " + resultSet.getString("judul_buku"));
                System.out.println("Tahun Terbit: " + resultSet.getString("tahun_terbit"));
                System.out.println("Stok: " + resultSet.getString("stok"));
                System.out.println("Penulis: " + resultSet.getString("penulis"));
                counter++;
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public static void deleteData(int bookId){
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "DELETE FROM buku WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, bookId);
            preparedStatement.execute();
        }
        catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public static void masukkanBuku(int bookId, String bookTitle, int publicationYear, int stock, String author){
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT INTO buku (id, judul_buku, tahun_terbit, stok, penulis) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, bookId);
            preparedStatement.setString(2, bookTitle);
            preparedStatement.setInt(3, publicationYear);
            preparedStatement.setInt(4, stock);
            preparedStatement.setString(5, author);
            preparedStatement.execute();
        }
        catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public static void editBuku(int bookId, String updatedTitle, int updatedYear, int updatedStock, String updatedAuthor){
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "UPDATE buku SET judul_buku = ?, tahun_terbit = ?, stok = ?, penulis = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, updatedTitle);
            preparedStatement.setInt(2, updatedYear);
            preparedStatement.setInt(3, updatedStock);
            preparedStatement.setString(4, updatedAuthor);
            preparedStatement.setInt(5, bookId);
            preparedStatement.execute();
        }
        catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
