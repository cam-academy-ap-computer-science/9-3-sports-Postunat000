
public class Player {
	private String name;
	private boolean hasTeam;
	private int age;
	private int yearsPlaying;

	public void player(String name, boolean hasTeam, int age, int yearsPlaying) {
		this.name = name;
		this.hasTeam = hasTeam;
		this.age = age;
		this.yearsPlaying = yearsPlaying;
	}

	public String nameToString() {
		return name;
	}

	public boolean hasTeamToString() {
		return hasTeam;
	}

	public int ageToString() {
		return age;
	}
	
	public int yearsPlayingToString() {
		return yearsPlaying;
	}
}

