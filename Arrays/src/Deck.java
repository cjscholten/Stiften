import java.util.Arrays;

/**
 * Een deck met Cards
 * 
 * @author Youri Tjang
 *
 */
public class Deck {
	Card[] cardArray;

	/**
	 * Constructor
	 */
	Deck(){
		cardArray = new Card[0];
	}

	/**
	 * Vult de array met 52 kaarten: 2,3 ... ,10,V,B,K,A van klaveren, schoppen,
	 * harten en ruiten.
	 */
	public void fillDeck() {		
		tempArray = new Card[52];
		for (int i = 2;i< 9;i++)
		{			
				tempArray[i-2] = new Card("Klaveren",i.toString());
				tempArray[(i+13)-2] = new Card("Schoppen",i.toString());
				tempArray[(i+26)-2] = new Card("Harten",i.toString());
				tempArray[(i+39)-2] = new Card("Ruiten",i.toString());							
		}
		tempArray[9] = new Card("Klaveren","Boer");
		tempArray[22] = new Card("Schoppen","Boer");
		tempArray[35] = new Card("Harten","Boer");
		tempArray[48] = new Card("Ruiten","Boer");	
		tempArray[10] = new Card("Klaveren","Vrouw");
		tempArray[23] = new Card("Schoppen","Vrouw");
		tempArray[36] = new Card("Harten","Vrouw");
		tempArray[49] = new Card("Ruiten","Vrouw");	
		tempArray[11] = new Card("Klaveren","Koning");
		tempArray[24] = new Card("Schoppen","Koning");
		tempArray[37] = new Card("Harten","Koning");
		tempArray[50] = new Card("Ruiten","Koning");	
		tempArray[12] = new Card("Klaveren","Aas");
		tempArray[25] = new Card("Schoppen","Aas");
		tempArray[38] = new Card("Harten","Aas");
		tempArray[51] = new Card("Ruiten","Aas");	
	}

	/**
	 * Zoals gezegd is dit spel een beetje vreemd. Bijvoorbeeld: spelers kunnen
	 * kaarten toevoegen aan het deck. Hierdoor kan het aantal kaarten groter
	 * worden dan 52.
	 * 
	 * @param card
	 *            een Kaart
	 * @param index
	 *            Op positie
	 */
	public void insertAt(Card card, int index) {
		if (index >= cardArray.size -1){
			tempArray = new card[cardArray.size +1];
			tempArray.toArray(cardArray);
			tempArray[index] = card;
			cardArray = tempArray;
		}else {
			cardArray[index] = card;
		}
	}

	/**
	 * Kaarten kunnen ook verwijderd worden uit het deck. delete Haalt de kaart
	 * met een bepaalde index er uit.
	 * 
	 * Merk op: na delete is de array zo groot als het aantal elementen dat er in zit.
	 * 
	 * @param index
	 */
	public void delete(int index) {
	
	}

	/**
	 * Schud alle kaarten zodat de volgorde 'willekeurig' is. Hiervoor is het
	 * toegestaan de Java Random generator te gebruiken.
	 * 
	 */
	public void shuffle() {
	}

	/**
	 * Een gegeven kaart moet worden opgezocht in de array, en de index ervan
	 * moet als return worden teruggegeven. Zie [Hubbard p.30]
	 * 
	 * @param card
	 *            de kaart die gezocht wordt
	 * @return De index van de gevonden kaart
	 */
	public int sequentialSearch(Card card) {
		return 0;
	}

	/**
	 * Legt de kaarten op volgorde. We nemen aan dat een deck op volgorde ligt,
	 * als de volgorde hetzelfde is als na {@link #fillDeck()}
	 */
	public void sort() {
	}

	/**
	 * Een bepaalde kaart moet worden opgezocht in de gesorteerde array op de
	 * binary search manier zoals besproken in [Hubbart p.31].
	 * 
	 * @param card
	 *            de kaart die gezocht wordt
	 * @return De index van de gevonden kaart
	 */
	public int binarySearch(Card card) {
		return 0;
	}

	
	
	/**
	 *  Pretty-print het deck.
	 */
	@Override
	public String toString() {
		String str = "";
		
		for(int i=0; i<cardArray.length;i++){
			str += cardArray[i];
		}
		return str;
		
	}
}
