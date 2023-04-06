package stream_examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StringStream {

	public static void main(String[] args) {
		String[] imena = {"Pera Peric", "Zika Zikic",
				"Aleksandar Jovanovic", "Mika Miladonovic"};
		
		Arrays.stream(imena).sorted(Comparator.reverseOrder()).forEach( ime -> System.out.println(ime));
	
		List<String> rezultat =
			Arrays.stream(imena).filter( ime -> ime.contains("M")).toList();
		
		System.out.println(rezultat);
		
		int[] duzine = 
				Arrays.stream(imena).mapToInt( ime -> ime.length()).toArray();
		
		System.out.println( Arrays.toString(duzine) );
		
		try {
			Stream<String> lines = Files.lines(Paths.get("proba.txt"));
			
			lines.filter( red -> red.length()>15)
			.forEach( red -> System.out.println(red) );
			
			lines.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
