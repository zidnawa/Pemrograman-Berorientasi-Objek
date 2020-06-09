package com.Tugas;

import java.util.Scanner;

public class Kriptografi {
	/*private Enkripsi enkrip;
	private Dekripsi dekrip;
	private Scanner input;*/
	public static void main(String[] args) {
		//Kriptografi kripto = new Kriptografi();
		Enkripsi enkrip = new Enkripsi();
		Dekripsi dekrip = new Dekripsi();
		Scanner input = new Scanner(System.in);
		System.out.println("Selamat datang di aplikasi enkripsi dan dekripsi Sandi Caesar.");
		System.out.println();
		System.out.println("		Disusun oleh:");
		System.out.println("	Zidna Wildan Alfain (1817101468)");
		System.out.println();
		System.out.println("Tekan 'enter' untuk memulai aplikasi.");
		System.out.println("Ketik 'keluar' untuk keluar dari aplikasi.");
		boolean selesai = false;
		while(!selesai) {
			String masukan = input.nextLine();
			if(masukan.startsWith("keluar")) {
				selesai = true;
			}
			else {
				Scanner in = new Scanner(System.in);
				System.out.println("Ketik 'E' untuk enkripsi dan 'D' untuk dekripsi.");
				char pilihan = in.next().charAt(0);
				if (pilihan == 'E') {
					String plaintext = enkrip.masukkanTeksTerang();
					String ciphertext = enkrip.prosesEnkripsi(plaintext);
					System.out.println("Teks Sandi: " + ciphertext);
					System.out.println();
					System.out.println("Tekan 'enter' untuk enkripsi/dekripsi lagi.");
					System.out.println("Ketik 'keluar' untuk keluar dari aplikasi.");
				} 
				else if(pilihan == 'D') {
					String ciphertext = dekrip.masukkanTeksSandi();
					String plaintext = dekrip.prosesDekripsi(ciphertext);
					System.out.println("Teks Terang: " + plaintext);
					System.out.println();
					System.out.println("Tekan 'enter' untuk enkripsi/dekripsi lagi.");
					System.out.println("Ketik 'keluar' untuk keluar dari aplikasi.");
				}
				else {
					System.out.println("ERROR: Seharusnya ketik 'E' atau 'D'.");
					System.out.println();
					System.out.println("Tekan 'enter' untuk enkripsi/dekripsi lagi.");
					System.out.println("Ketik 'keluar' untuk keluar dari aplikasi.");
				}
			}
		}
		System.out.println("Terima kasih...");
	}
}