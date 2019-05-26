package belajar.spring.iocdi.dengandi;

import belajar.spring.iocdi.KoneksiDatabase;
import belajar.spring.iocdi.tanpadi.NasabahDAOTanpaDI;

public class DemoDI {

	public static void main(String[] args) {
		KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
		koneksiDatabase.setUrl("jdbc:postgresql://localhost/belajar");
		koneksiDatabase.setUsername("demo");
		koneksiDatabase.setPassword("cobacoba");
		//jika menggunakan setter injection, ada kemungkinan kita lupa melakukan set Injection
//		nd.setKoneksiDatabase(koneksiDatabase);
		NasabahDaoDI nd = new NasabahDaoDI(koneksiDatabase);
		nd.simpan();
	}

}
