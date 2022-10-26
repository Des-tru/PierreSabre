package personnages;

public class Humain {

	private String nom;
	private String boissonfavorite;
	private int argent;
	
	
	public Humain(String nom, String boissonfavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argent = argent;
		}
	
	
	public String getNom() {
		return nom;
		}
	
	public int getArgent() {
		return argent;
		}
	
	private String parler() {
		return "("+nom +") -";
		}
	
	public void gagnerArgent(int gain) {
		argent = argent + gain;
	}
	
	public void perdreArgent(int perte) {
		argent = argent - perte;
	}
	
	
	public void direBonjour() { 
		System.out.println(parler()+"Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boissonfavorite);
		}
	
	public void boire() {
		System.out.println(parler()+"Mmmm, un bon verre de "+boissonfavorite+" ! GLOUPS !");	
	}
	
	public void acheter(String bien,int prix) {
		if (prix>argent) {
			System.out.println(parler()+"Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous.");}
		else {
				System.out.println(parler()+"J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous.");
				perdreArgent(prix);
			}
		}
		
	}
