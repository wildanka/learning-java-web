package belajar.spring.iocdi.dengandi;

import belajar.spring.iocdi.KoneksiDatabase;

public class NasabahDaoDI {
	private KoneksiDatabase koneksiDatabase;

	/**
	 * Constructor Injection, 
	 * menggunakan Constructor Injection akan memaksa kita untuk melakukan injection 
	 * setiap kali akan memanggil objek dari class DAO ini
	 * @param koneksiDatabase
	 */
	public NasabahDaoDI(KoneksiDatabase koneksiDatabase) {
		this.koneksiDatabase = koneksiDatabase;
	}


	//setter injection
	public void setKoneksiDatabase(KoneksiDatabase koneksiDatabase) {
		this.koneksiDatabase = koneksiDatabase;
	}


	private void connectToDB() {
		koneksiDatabase.connect();
	}

	private void disconnectToDB() {

	}

	public void simpan() {
		connectToDB();
		System.out.println("Menyimpan Data");
		disconnectToDB();
	}

	public void cariData() {

	}
}
