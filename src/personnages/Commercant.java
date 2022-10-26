package personnages;

public class Commercant extends Humain{

	public Commercant(String nom,int argent) {
		super(nom, "thé", argent);
	}

	public void seFaireExtorquer() {
		perdreArgent(argent);
		System.out.println(parler()+"J'ai tout perdu! Le monde est trop injuste...");
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		System.out.println(parler()+argent+" sous ! Je te remercie généreux donateur!");;
	}
}
