package week03_111296;

import java.util.Scanner;

public class tutorial {

	public static void main(String[] args) {
		int input;
		Scanner scanner = new Scanner(System.in);
		
		String[] matkulIF = {
			"Matematika Diskrit",
			"Dasar-dasar Pemrogramman",
			"Pemrogramman berbasis objek"
		};

		String[] matkulCE = {
			"Riset Operasi",
			"Jaringan Komputer",
			"Aljabar Linear"
		};

		String[] matkulIS = {
			"Sistem Database",
			"Administrasi Database"
		};
		System.out.println("Pilih Kategori Matkul: ");
		System.out.println("1. Informatika/n2. Teknik Komputer/n3. Sistem Informasi");
		System.out.println("Pilih Kategori Matkul: ");
		input=scanner.nextInt();
			
		switch(input) {
		case 1: System.out.println("Daftar Mata Kuliah IF");
			show(matkulIF);
		break;
		case 2: System.out.println("Daftar Mata Kuliah CE");
		show(matkulCE);
		break;
		case 3: System.out.println("Daftar Mata Kuliah IS");
		show(matkulIS);
	break;
	
		}
	}
	public static void show(String[] matkul) {
		for (String eachMatkul : matkul) {
			System.out.println("- "+ eachMatkul);
		}
	}

}
