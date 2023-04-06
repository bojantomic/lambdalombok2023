package lambda;

public class Proba {
	
	public static void main(String[] args) {
		
		IntOperacija saberi = (x, y) -> {return x + y;};
		
		IntOperacija oduzmi = (x, y) -> x-y;
		
		System.out.println( saberi.izracunaj(34, 55)  );
		
		System.out.println( oduzmi.izracunaj( 34132, 112121));
		
		IntOperacija stepenovanje = (a, n) ->
		{
			int stepen = 1;
			
			for (int i=1; i<=n; i++)
				stepen = stepen * a;
			
			return stepen;
		};
		
		System.out.println( stepenovanje.izracunaj(2, 9) );
	}

}
