package july26ga;

public class Movie {

	public String name;
	public String directorName ;
    public int durationMins;
    public int releasedYear;
    
	public Movie(String name, String directorName, int durationMins, int releasedYear) {
		super();
		this.name = name;
		this.directorName = directorName;
		this.durationMins = durationMins;
		this.releasedYear = releasedYear;
	}
    
    public Movie() {
    
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public int getDurationMins() {
		return durationMins;
	}
	public void setDurationMins(int durationMins) {
		this.durationMins = durationMins;
	}
	public int getReleasedYear() {
		return releasedYear;
	}
	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}

}
