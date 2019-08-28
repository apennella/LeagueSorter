package releaseSort;

import java.util.Comparator;

public class SortbyRelease  implements Comparator<Champion>{



	@Override
	public int compare(Champion o1, Champion o2) {
		// TODO Auto-generated method stub
		return o1.getRelease().compareTo(o2.getRelease());
	}


	
	
}
