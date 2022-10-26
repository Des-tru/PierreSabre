package histoire;
import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain brice = new Humain("Brice","Kebab",210);
		brice.direBonjour();
		brice.acheter("une chaussure", 9);
		brice.boire();
		brice.acheter("un chat", 60);
		brice.acheter("la Lune", 62501);
		
	}

}
