package stream_examples;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFromList {

	public static void main(String[] args) {
		PolovniAutomobil a1 =
			new PolovniAutomobil("Opel", "Insignia", 1998, 132000, 4500, 2003);
		PolovniAutomobil a2 =
				new PolovniAutomobil("Opel", "Corsa", 1399, 47500, 8500, 2018);
		PolovniAutomobil a3 =
				new PolovniAutomobil("Chevrolet", "Spark", 997, 112000, 3200, 2012);
		PolovniAutomobil a4 =
				new PolovniAutomobil("VW", "Golf", 1598, 212000, 9200, 2015);

		List<PolovniAutomobil> automobili =
				new LinkedList<PolovniAutomobil>();
		
		automobili.add(a1);
		automobili.add(a2);
		automobili.add(a3);
		automobili.add(a4);
		
		Stream<PolovniAutomobil> str = automobili.stream();

		str.filter( auto -> auto.getMarka().equalsIgnoreCase("Opel"))
		.sorted( (auto1, auto2) -> auto1.getCena() - auto2.getCena() )
		.forEach( auto -> System.out.println(auto) );
		
		List<PolovniAutomobil> rezultati = 
				automobili.stream().
				filter( auto -> auto.getCena()<9900 
						&& auto.getKilometraza()<90000).toList();
		
		System.out.println(rezultati);
		
		System.out.println( automobili.stream().anyMatch(
				auto -> auto.getGodinaProizvodnje()>2017 && auto.getCena()<5000));
		
		//Tri najskuplja automobila
		automobili.stream().
			sorted( (auto1,auto2) -> auto2.getCena() - auto1.getCena())
			.limit(3).forEach( auto -> System.out.println(auto));
		
		
		
		
	}

}
