package belajar.spring.iocdi.tanpadi;

import belajar.spring.iocdi.KoneksiDatabase;

public class NasabahDAOTanpaDI {
	private KoneksiDatabase koneksiDatabase;
	
	public NasabahDAOTanpaDI() {
		koneksiDatabase = new KoneksiDatabase();
		koneksiDatabase.setUrl("jdbc:postgresql://localhost/belajar");
		koneksiDatabase.setUsername("demo");
		koneksiDatabase.setPassword("cobacoba");
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
