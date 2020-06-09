package com.Tugas;

import java.util.Scanner;

public class Dekripsi {
	private Scanner baca;
	
	public Dekripsi() {
		baca = new Scanner(System.in);
	}
	
	public String masukkanTeksSandi() {
		System.out.print("Teks Sandi: ");
		String teksSandi = baca.nextLine();
		return teksSandi;
	}
	
	public String prosesDekripsi(String inputan) {
		System.out.print("Kunci: ");
		int kunci = baca.nextInt();
		String hasil = "";
		for(int i = 0; i < inputan.length(); i++) {
			char alfabet = inputan.charAt(i);
			if(alfabet >= 'a' && alfabet <= 'z') {
				alfabet = (char)(alfabet - kunci);
				if(alfabet < 'a') {
					alfabet = (char)(alfabet - 'a' + 'z' + 1);
				}
				hasil = hasil + alfabet;
			}
			else if(alfabet >= 'A' && alfabet <= 'Z') {
				alfabet = (char)(alfabet - kunci);
				if(alfabet < 'A') {
					alfabet = (char)(alfabet - 'A' + 'Z' + 1);
				}
				hasil = hasil + alfabet;
			}
			else {
				hasil = hasil + alfabet;
			}
		}
		return hasil;
	}
}
