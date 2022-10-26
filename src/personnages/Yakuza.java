package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boissonfavorite, int argent, String clan) {
		super(nom, boissonfavorite, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant victime) {
		System.out.println(parler()+" Tiens, tiens ne serait-ce pas un faible marchand qui passe par là ?");
	}
}
