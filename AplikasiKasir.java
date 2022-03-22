package Mvan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Kasir {
    Integer Id;
    String NamaBarang;
    Integer Stock;
    double Harga;
    Integer Terjual;

    public Kasir(int id, String NamaBarang, int Stock, Double Harga, int Terjual){
        this.Id = id;
        this.NamaBarang = NamaBarang;
        this.Stock = Stock;
        this.Harga = Harga;
        this.Terjual = Terjual;
    }
}

public class AplikasiKasir {

    public static void main(String[] args) {
        ArrayList<Kasir> Data = new ArrayList<>();

        String DataBarang = "D:\\Ngoding\\Java vscode\\Aplikasi kasir\\src\\Mvan\\DataBarang.txt";
        String DataTransaksi = "D:\\Ngoding\\Java vscode\\Aplikasi kasir\\src\\Mvan\\DataTransaksi.txt";

        boolean run = true;
        int id = -1;
        int i = -1;

        while(run){
            System.out.println("==========================");
            System.out.println();
            System.out.println(" [1]. DATA BARANG         ");
            System.out.println(" [2]. TAMBAH BARANG       ");
            System.out.println(" [3]. TAMBAH STOCK BARANG ");
            System.out.println(" [4]. HAPUS DATA BARANG   ");
            System.out.println(" [5]. PENJUALAN           ");
            System.out.println(" [6]. EXIT                ");
            System.out.println();
            System.out.println("==========================");

            Scanner scan = new Scanner(System.in);
            System.out.print("Input Pilihan : ");
            String opsi = scan.next();
            System.out.println("==========================");
            if(opsi.equals("1")){
                System.out.println("Id\t"+"Barang\t\t"+"Stock\t\t"+"Terjual\t\t"+"Harga\n");
                try{
                    File myFile = new File(DataBarang);
                    Scanner fileReader = new Scanner(myFile);

                    while(fileReader.hasNextInt()){
                        String data = fileReader.nextLine();
                        System.out.println(data);
                    }
                    System.out.println("==========================");
                }catch(IOException e){
                    System.out.println("Terjadi Kesalahan : "+ e.getMessage());
                }
            }
            else if(opsi.equals("2")){
                System.out.print("Nama Barang   : ");
                String NamaBarang = scan.next();
                System.out.print("jumlah Barang : ");
                int JumlahBarang = scan.nextInt();
                System.out.print("Harga Barang  : ");
                Double Harga = scan.nextDouble();
                int Terjual = 0;
                System.out.println("==========================");
                System.out.println("Save? Yes/No");
                String save = scan.next();
                System.out.println();
                if(save.equalsIgnoreCase("Yes")){
                    id++;
                    i++;
                    Data.add(new Kasir(id, NamaBarang, JumlahBarang, Harga, Terjual));
                    System.out.println("Data berhasil Disimpan");
                    try{
                        FileWriter fw = new FileWriter(DataBarang, true);
                        fw.append(Data.get(i).Id+"\t"+Data.get(i).NamaBarang+"\t\t"+Data.get(i).Stock+"\t\t"+Data.get(i).Terjual+"\t\t"+Data.get(i).Harga+"\n");
                        fw.close();
                    }catch(IOException e){
                        System.out.println("Terjadi Kesalahan : "+ e.getMessage());
                    }
                }else{
                    System.out.println();
                    System.out.println("Batal");
                }
            }if(opsi.equals("3")){
                int index = -1;
                boolean ditemukan = false;
                System.out.print("Input Id : ");
                int kodebarang = scan.nextInt();
                for(int x = 0; x<Data.size(); x++){
                    if(Data.get(x).Id == kodebarang){
                        index = x;
                        ditemukan = true;
                    }
                }
                if(ditemukan == true){
                    System.out.println("Jumlah penambahan stock : ");
                    int TambahStock = scan.nextInt();
                    System.out.println("==========================");
                    System.out.println("Save? Yes/No");
                    String Tambah = scan.next();
                    System.out.println("==========================");
                    if(Tambah.equalsIgnoreCase("Yes")){
                        Kasir updatestock = Data.get(kodebarang);
                        updatestock.Stock = Data.get(kodebarang).Stock + TambahStock;
                        System.out.println("Berhasil ditambahkan");
                        try{
                            FileWriter fw = new FileWriter(DataBarang, false);
                            for(Kasir kasirku : Data){
                                fw.append(kasirku.Id+"\t"+kasirku.NamaBarang+"\t\t"+kasirku.Stock+"\t\t"+kasirku.Terjual+"\t\t"+kasirku.Harga+"\n");
                            }
                            fw.close();
                        }catch(IOException e){
                            System.out.println("Terjadi Kesalahan : "+ e.getMessage());
                        }
                    }else{
                        System.out.println("==========================");
                        System.out.println("Batal ditambahkan");
                    }
                }
                else{
                    System.out.println("==========================");
                    System.out.println("Id salah");
                }
            }
            if(opsi.equals("4")){
                int index = -1;
                boolean ditemukan = false;
                System.out.print("Input Id untuk menghapus Barang : ");
                int hapus = scan.nextInt();

                for(int j = 0; j<Data.size(); j++){
                    if(Data.get(j).Id == hapus){
                        index = j;
                        ditemukan = true;
                    }
                }
                if(ditemukan == true){
                    System.out.println("Hapus? Yes/No");
                    String HapusBarang = scan.next();
                    if(HapusBarang.equalsIgnoreCase("Yes")){
                        Data.remove(hapus);
                        System.out.println("Data barang berhasil dihapus");
                        try{
                            FileWriter fw = new FileWriter(DataBarang, false);
                            for(Kasir barangku : Data){
                                fw.append(barangku.Id+"\t"+barangku.NamaBarang+"\t\t"+barangku.Stock+"\t\t"+barangku.Terjual+"\t\t"+barangku.Harga+"\n");
                            }
                            fw.close();
                        }catch(IOException e){
                            System.out.println("Terjadi Kesalahan : "+ e.getMessage());
                        }
                    }
                    else{
                        System.out.println();
                        System.out.println("Batal");
                    }
                }
                else{
                    System.out.println();
                    System.out.println("Id salah");
                }
            }
            if(opsi.equals("5")){
                System.out.println("=====================================================");
                System.out.println("Id\t"+"Barang\t\t"+"Stock\t\t"+"Terjual\t\t"+"Harga\n");
                System.out.println("=====================================================");
                try{
                    File myFile = new File(DataBarang);
                    Scanner fr = new Scanner(myFile);

                    while(fr.hasNextLine()){
                        String data = fr.nextLine();
                        System.out.println(data);
                    }
                    System.out.println("=================================================");
                }catch(IOException e){
                    System.out.println("Terjadi Kesalahan : "+ e.getMessage());
                }
                System.out.println("=================================================");
                System.out.println("Id barang yang dibeli : ");
                int PilihBarang = scan.nextInt();
                int index = -1;
                boolean ditemukan = false;

                for(int j = 0; j<Data.size(); j++){
                    if(Data.get(j).Id == PilihBarang){
                        index = j;
                        ditemukan = true;
                    }
                }
                if(ditemukan == true){
                    System.out.println("==========================");
                    System.out.println("Total barang belanjaan : ");
                    int TotalBelanja = scan.nextInt();
                    Kasir update = Data.get(PilihBarang);
                    update.Stock = Data.get(PilihBarang).Stock - TotalBelanja;
                    update.Terjual = Data.get(PilihBarang).Terjual + TotalBelanja;
                   try{
                         FileWriter fw = new FileWriter(DataBarang, false);
                          for(Kasir barangku : Data){
                            fw.append(barangku.Id+"\t"+barangku.NamaBarang+"\t\t"+barangku.Stock+"\t\t"+barangku.Terjual+"\t\t"+barangku.Harga+"\n");
                        }
                        fw.close();
                    }catch(IOException e){
                    System.out.println("Terjadi Kesalahan : "+ e.getMessage());
                    }
                    try{
                    FileWriter fw = new FileWriter(DataTransaksi, true);
                    fw.write("==========================");
                    fw.write("\nData Belanja");
                    fw.write("==========================");
                    fw.write("\nId Barang : "+PilihBarang);
                    fw.write("\nNama Barang : "+Data.get(index).NamaBarang);
                    fw.write("\nJumlah Barang : "+ TotalBelanja);
                    fw.write("\nHarga Barang : "+ Data.get(index).Harga);
                    fw.write("==========================");
                    fw.write("Total : "+Data.get(index).Harga * TotalBelanja);
                    fw.close();
                    }catch(IOException e){
                        System.out.println("Terjadi Kesalahan : "+ e.getMessage());
                    }
                    try{
                        File myFile = new File(DataTransaksi);
                        Scanner fr = new Scanner(myFile);

                        while(fr.hasNextLine()){
                            String data = fr.nextLine();
                            System.out.println(data);
                        }
                    }catch(IOException e){
                        System.out.println("Terjadi Kesalahan : "+ e.getMessage());
                    }
                }
                else{
                    System.out.println("==========================");
                    System.out.println("Id salah");
                }
            }
            else if (opsi.equals("6")){
                break;
            }
        }
    }
}
