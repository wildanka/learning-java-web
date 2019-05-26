package belajar.spring.iocdi.dengandi;

import belajar.spring.iocdi.KoneksiDatabase;

public class NasabahDaoDI {
	private KoneksiDatabase koneksiDatabase;

	public NasabahDaoDI() {
		// tanpa inisialisasi karena sudah dihandle class lain
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
