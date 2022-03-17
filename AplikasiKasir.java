package Kasir.AplKasir;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Kasir{
    public Kasir(int id, String namaBarang, int jumlahBarang, int harga, int soldOut) {
    }
    Integer Id;
    String NamaBarang;
    Integer Stock;
    Integer Harga;
    Integer SoldOut;
}

public class AplikasiKasir {

    public static void main(String[] args) {
        ArrayList<Kasir> Data = new ArrayList<>();

        String DataBarang = "D:\\Ngoding\\Java vscode\\Aplikasi kasir\\src\\Kasir\\AplKasir\\Databrang.txt";
        String DataTransaksi = "D:\\Ngoding\\Java vscode\\Aplikasi kasir\\src\\Kasir\\AplKasir\\DataTransaksi.txt";

        boolean run = true;
        int id = -1;
        int i = -1;

        while(run){
            System.out.println("----------------------------");
            System.out.println("========= M E N U ==========");
            System.out.println("----------------------------");
            System.out.println("+ [1]. DATA BARANG         +");
            System.out.println("+ [2]. TAMBAH BARANG       +");
            System.out.println("+ [3]. TAMBAH STOCK BARANG +");
            System.out.println("+ [4]. HAPUS DATA BARANG   +");
            System.out.println("+ [5]. PENJUALAN           +");
            System.out.println("+ [6]. EXIT                +");
            System.out.println("----------------------------");

            Scanner scan = new Scanner(System.in);
            System.out.print("Input Pilihan : ");
            String opsi = scan.next();
            System.out.println("----------------------------");
            if(opsi.equals("1")){
                System.out.println("Id\t"+"Barang\t\t"+"Stock\t\t"+"Terjual\t\t"+"Harga\n");
                try{
                    String Databarang;
                    File myFile = new File(Databarang);
                    Scanner fileReader = new Scanner(myFile);

                    while(fileReader.hasNextLine()){
                        String data = fileReader.nextLine();
                        System.out.println(data);
                    }

                }catch(IOException e){
                    System.out.println("Terjadi kesalahan : "+e.getMessage());
                }

            }
            else if(opsi.equals("2")){
                System.out.print("Nama barang : ");
                String NamaBarang = scan.nextLine();
                System.out.println("Jumlah barang : ");
                int JumlahBarang = scan.nextInt();
                System.out.println("Harga barang : ");
                int Harga = scan.nextInt();
                int SoldOut = 0;
                System.out.println();
                System.out.println("Save? Yes/No");
                String save = scan.next();
                System.out.println();
                if(save.equalsIgnoreCase("Yes")){
                    id++;
                    i++;
                    DataBarang.add(new Kasir(id, NamaBarang, JumlahBarang, Harga, SoldOut));
                    System.out.println("Data berhasil disimpan");
                }

            }
        }
    }
}
