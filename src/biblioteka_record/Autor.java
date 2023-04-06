package biblioteka_record;

/**
 * Predstavlja autora knjige. Atributi su ime i prezime i nepromenljivi su.
 * 
 * @author Bojan Tomic
 *
 */
public record Autor(String ime, String prezime, int godinaRodjenja) {

	/**
	 * Pravi objekat klase Autor.
	 * 
	 * 
	 * @param ime Ime autora. Ne sme biti null.
	 * @param prezime Prezime autora. Ne sme biti null.
	 * @param godinaRodjenja Godina rodjenja autora. Mora biti nula ili veca.
	 * 
	 * @throws NullPointerException Ako je uneto null ime ilil prezime.
	 * @throws IllegalArgumentException Ako je uneta negativna godina rodjenja.
	 */
	public Autor {
		if (ime == null || prezime == null)
			throw new NullPointerException("Ime i prezime ne smeju biti null");
		
		if (godinaRodjenja < 0)
			throw new IllegalArgumentException("Godina rodjenja mora biti veca od nule");
	}

	@Override
	public String toString() {
		return ime + ", " + prezime + " (" + godinaRodjenja + ")";
	}
	
	
	
}
