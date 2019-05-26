package belajar.spring.iocdi.dengandi;

import belajar.spring.iocdi.KoneksiDatabase;
import belajar.spring.iocdi.tanpadi.NasabahDAOTanpaDI;

public class DemoDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NasabahDaoDI nd = new NasabahDaoDI();
		

		KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
		koneksiDatabase.setUrl("jdbc:postgresql://localhost/belajar");
		koneksiDatabase.setUsername("demo");
		koneksiDatabase.setPassword("cobacoba");
		nd.setKoneksiDatabase(koneksiDatabase);
		nd.simpan();
	}

}
