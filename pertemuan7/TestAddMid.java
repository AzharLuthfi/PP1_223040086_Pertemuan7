package pertemuan7;

public class TestAddMid {
	public static void main(String[] args) {
		StrukturList list = new StrukturList();

	    list.addMid(new Matakuliah("IF003 ", "Struktur Diskrit, ", 3),2);
	    list.addMid(new Matakuliah("IF004 ", "Konstruksi PL Berorientasi Objek, ", 3), 1);
	    list.addMid(new Matakuliah("IF001 ", "Dasar Pemrograman, ", 4),4);
	    list.addMid(new Matakuliah("IF002 ", "Pemrograman Web, ", 3),3);


	    list.displayElement();
	  }

}
