package com.Tugas;

import java.util.Scanner;

public class Enkripsi {
	private Scanner baca;
	
	public Enkripsi() {
		baca = new Scanner(System.in);
	}
	
	public String masukkanTeksTerang() {
		System.out.print("Teks Terang: ");
		String teksTerang = baca.nextLine();
		return teksTerang;
	}
	
	public String prosesEnkripsi(String inputan) {
		System.out.print("Kunci: ");
		int kunci = baca.nextInt();
		String hasil = "";
		char alfabet;
		for(int i = 0; i < inputan.length(); i++) {
			alfabet = inputan.charAt(i);
			if(alfabet >= 'a' && alfabet <= 'z') {
				alfabet = (char)(alfabet + kunci);
				if(alfabet > 'z') {
					alfabet = (char)(alfabet + 'a' - 'z' - 1);
				}
				hasil = hasil + alfabet;
			}
			else if(alfabet >= 'A' && alfabet <= 'Z') {
				alfabet = (char)(alfabet + kunci);
				if(alfabet > 'Z') {
					alfabet = (char)(alfabet + 'A' - 'Z' - 1);
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
