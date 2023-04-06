package biblioteka_lombok;

import biblioteka_record.Autor;
import lombok.*;


@Getter
@Setter
@EqualsAndHashCode (of = {"isbn"} )
@ToString (exclude = {"isbn", "izdanje"})
@Builder
public class Knjiga {
	
	@Setter (value = AccessLevel.PROTECTED)
	private long isbn;
	
	@NonNull
	private String naslov;
	
	private Autor[] autori;
	
	@NonNull
	private String izdavac;
	
	private int izdanje;

}
