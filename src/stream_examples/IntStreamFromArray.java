package stream_examples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamFromArray {

	public static void main(String[] args) {
		int[] niz = {12, 34, 56, 9393, 200};
		
		IntStream str = Arrays.stream(niz);
		
		System.out.println( str.average().getAsDouble() );
		
		System.out.println( Arrays.stream(niz).max().getAsInt() );
		
		System.out.println( 
				Arrays.stream(niz).filter( x -> x > 23 ).sum()  );
		
		int[] niz2 = Arrays.stream(niz).filter( x -> x<23).toArray();
		
		for(int x: niz2)
			System.out.print(x + " ");
		
		System.out.println();
		
		
		Arrays.stream(niz).mapToDouble( x -> Math.sqrt(x))
		.forEach( x -> System.out.print(x + " "));
	}

}
