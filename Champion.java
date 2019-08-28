package releaseSort;

import java.time.LocalDate;

public class Champion {
	
	private String name;
	private LocalDate release;
	
	public Champion(String name, LocalDate release) {
		super();
		this.name = name;
		this.release = release;
	}
	
	

	public Champion() {
		super();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getRelease() {
		return release;
	}

	public void setRelease(LocalDate release) {
		this.release = release;
	}



	@Override
	public String toString() {
		return "Champion [name=" + name + ", release=" + release + "]";
	}
	
	
	
	
}