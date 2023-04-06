package biblioteka_lombok;

import biblioteka_record.Autor;

public class Proba {

	public static void main(String[] args) {
		Autor a = new Autor("Zika", "Zikic", 1999);
		Autor[] autori = {a};
		
		/*Knjiga k1 = new Knjiga();
		
		k1.setIsbn(1231231);
		k1.setNaslov("Knjiga 1");
		k1.setIzdanje(1);
		k1.setIzdavac("Laguna");
		k1.setAutori(autori);*/
		
		Knjiga k1 = Knjiga.builder().autori(autori).isbn(1231231)
				.izdavac("Laguna").izdanje(2).naslov("Knjiga 2").build();
		
		System.out.println(k1);
	}

}
