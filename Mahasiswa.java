package com.mycompany.project1;

import java.util.Arrays;

class Mahasiswa {
    private String nim;
    private String nama;
    private int semester;
    private int usia;
    private String[] krs;

    public Mahasiswa(String nim, String nama, int semester, int usia, String[] krs) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
    }

    public void infoMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Semester: " + semester);
        System.out.println("Usia: " + usia);
        System.out.println("KRS: " + Arrays.toString(krs));
    }

    public float hitungRataNilai(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (float) total / nilai.length;
    }

    public void infoKrsMahasiswa() {
        System.out.println("KRS: " + Arrays.toString(krs));
    }
}

class MahasiswaAktif extends Mahasiswa {
    public MahasiswaAktif(String nim, String nama, int semester, int usia, String[] krs) {
        super(nim, nama, semester, usia, krs);
    }
}

class MahasiswaBaru extends Mahasiswa {
    private String asalSekolah;

    public MahasiswaBaru(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah) {
        super(nim, nama, semester, usia, krs);
        this.asalSekolah = asalSekolah;
    }

    public void ikutOspek() {
        // implementasi ikutOspek
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Sekolah: " + asalSekolah);
    }
}

class MahasiswaLulus extends Mahasiswa {
    private int tahunWisuda;
    private float ipk;

    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs, int tahunWisuda, float ipk) {
        super(nim, nama, semester, usia, krs);
        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
    }

    public void ikutWisuda() {
        // implementasi ikutWisuda
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda: " + tahunWisuda);
        System.out.println("IPK: " + ipk);
    }
}

class MahasiswaTransfer extends Mahasiswa {
    private String asalUniversitas;

    public MahasiswaTransfer(String nim, String nama, int semester, int usia, String[] krs, String asalUniversitas) {
        super(nim, nama, semester, usia, krs);
        this.asalUniversitas = asalUniversitas;
    }

    public void ikutOspek() {
        // implementasi ikutOspek
    }

    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Universitas: " + asalUniversitas);
    }
}
