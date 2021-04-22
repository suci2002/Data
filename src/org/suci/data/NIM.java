package org.suci.data;

import java.util.Scanner;

public class NIM {
    public static void main (String[] args) {

// Deklarasi variabel scanner
        Scanner input = new Scanner(System.in);
        // Ambil data dari keyboard
        System.out.print("Masukkan nama anda = ");
        String nama = input.next();
        System.out.print("Masukkan jenjang pendidikan anda = ");
        String jenjang = input.next();
        System.out.print("Masukkan tahun masuk anda = ");
        String tahun = input.next();
        System.out.print("Masukkan fakultas anda = ");
        String fakultas = input.next();
        System.out.print("Masukkan jurusan anda = ");
        String jurusan = input.next();
        System.out.print("Masukkan jenis kelamin anda = ");
        String jenis = input.next();
        System.out.print("Masukkan nomor urut mahasiswa = ");
        String nomor = input.next();

        // Menampilkan data yang diambil dari variabel scanner
        System.out.println("-------------BIODATA ANDA--------------");
        System.out.println("Nama  = " + nama);
        System.out.println("Jenjang pendidikan = " + jenjang);
        System.out.println("Tahun masuk  = " + tahun);
        System.out.println("Fakultas  = " + fakultas);
        System.out.println("Jurusan  = " + jurusan);
        System.out.println("Jenis kelamin  = " + jenis);
        System.out.println("Nomor urut mahasiswa  = " + nomor);
    }
}
