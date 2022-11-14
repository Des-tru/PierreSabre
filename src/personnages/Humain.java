package personnages;



public class Humain {
	static public int maxConnaissance = 30;
	protected String nom;
	protected String boissonfavorite;
	protected int argent;
	protected int nbConnaissance;
	protected Humain[] memoire;
	
	
	public Humain(String nom, String boissonfavorite, int argent) {
		super();
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argent = argent;
		this.nbConnaissance = 0;
		}
	
	
	public String getNom() {
		return nom;
		}
	
	public int getArgent() {
		return argent;
		}
	
	protected String parler() {
		return "("+nom +") - ";
		}
	
	public void gagnerArgent(int gain) {
		argent = argent + gain;
	}
	
	public void perdreArgent(int perte) {
		argent = argent - perte;
	}
	
	
	public void direBonjour() { 
		System.out.println(parler()+"Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boissonfavorite+".");
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
		
	public void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
		
	}
	
	public void memoriser(Humain humain) {
		if (nbConnaissance<maxConnaissance){
			memoire[nbConnaissance] = humain;
			nbConnaissance = nbConnaissance + 1;
		}
		else {
			for (int i=0;i<maxConnaissance-1;i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[maxConnaissance]=humain;
		}
	}
	
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
	}
	

	}
