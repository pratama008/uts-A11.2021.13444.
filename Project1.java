/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("Tambah Mahasiswa Baru? (y/n)");
                String jawaban = input.nextLine();
                
                if (jawaban.equals("n")) {
                    break;
                }
                
                System.out.println("Input data mahasiswa:");
                System.out.print("NIM: ");
                String nim = input.nextLine();
                
                System.out.print("Nama: ");
                String nama = input.nextLine();
                
                System.out.print("Semester: ");
                int semester = input.nextInt();
                input.nextLine();
                
                System.out.print("Usia: ");
                int usia = input.nextInt();
                input.nextLine();
                
                System.out.print("KRS (separate with comma): ");
                String[] krs = input.nextLine().split(",");
                
                System.out.println("Pilih jenis mahasiswa:");
                System.out.println("1. Mahasiswa Aktif");
                System.out.println("2. Mahasiswa Baru");
                System.out.println("3. Mahasiswa Lulus");
                System.out.println("4. Mahasiswa Transfer");
                
                int jenis = input.nextInt();
                input.nextLine();
                
                Mahasiswa mahasiswa;
                
                switch (jenis) {
                    case 1:
                        mahasiswa = new MahasiswaAktif(nim, nama, semester, usia, krs);
                        break;
                    case 2:
                        System.out.print("Asal Sekolah: ");
                        String asalSekolah = input.nextLine();
                        mahasiswa = new MahasiswaBaru(nim, nama, semester, usia, krs, asalSekolah);
                        break;
                    case 3:
                        System.out.print("Tahun Wisuda: ");
                        int tahunWisuda = input.nextInt();
                        input.nextLine();
                        
                        System.out.print("IPK: ");
                        float ipk = input.nextFloat();
                        input.nextLine();
                        
                        mahasiswa = new MahasiswaLulus(nim, nama, semester, usia, krs, tahunWisuda, ipk);
                        break;
                    case 4:
                        System.out.print("Asal Universitas: ");
                        String asalUniversitas = input.nextLine();
                        mahasiswa = new MahasiswaTransfer(nim, nama, semester, usia, krs, asalUniversitas);
                        break;
                    default:
                        System.out.println("Jenis mahasiswa tidak valid!");
                        continue;
                }
                
                listMahasiswa.add(mahasiswa);
            }
            
            System.out.println("\nDaftar Mahasiswa:");
            for (Mahasiswa m : listMahasiswa) {
                m.infoMahasiswa();
                System.out.println();
            }
        }
    }
}
