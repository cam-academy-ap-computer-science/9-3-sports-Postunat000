
public class TennisPlayer extends Player {
	private String racketBrand;
	
	public TennisPlayer(String name, int age, int yearsPlaying, String racketBrand) {
		super(name, age, yearsPlaying);
		this.racketBrand = racketBrand;
	}
}
