package stream_examples;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PolovniAutomobil {
	
	private String marka, model;
	
	private int kubikaza, kilometraza, cena, godinaProizvodnje;

}
