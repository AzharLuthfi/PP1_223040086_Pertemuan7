package pertemuan7;

public class TestAddHead {
	 public static void main(String[] args) {
		 	StrukturList list = new StrukturList();

		    list.addHead(new Matakuliah("IF004 ", "Konstruksi PL Berorientasi Objek, ", 3));
		    list.addHead(new Matakuliah("IF003 ", "Struktur Diskrit, ", 3));
		    list.addHead(new Matakuliah("IF002 ", "Pemrograman Web, ", 3));
		    list.addHead(new Matakuliah("IF001 ", "Dasar Pemrograman, ", 4));

		    list.displayElement();
		  }
}
