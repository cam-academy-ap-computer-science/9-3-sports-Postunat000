//superclass

public class Player {
	private String name;
	private int age;
	private int yearsPlaying;

	public Player(String name, int age, int yearsPlaying) {
		this.name = name;
		this.age = age;
		this.yearsPlaying = yearsPlaying;
	}

	public String nameToString() {
		return name;
	}

	public int ageToString() {
		return age;
	}
	
	public int yearsPlayingToString() {
		return yearsPlaying;
	}
}


