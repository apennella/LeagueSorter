package releaseSort;
import java.time.*;
public class ChampGenerator {
	
	
	public Champion createChampion(String line) {
		
		
		
		String[] removePNG = line.split(" ");
		String[] tabRemove = removePNG[1].split("\t");
		LocalDate release = LocalDate.parse(tabRemove[22]);
		
		Champion champ = new Champion(tabRemove[0], release);
		
		return champ;
		
		
	}

}
