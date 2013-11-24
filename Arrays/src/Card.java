/**
 * 
 * @author Youri Tjang
 *
 */
public class Card {
	/**
	 * Klaver, Schoppen, Harten of Ruiten 
	 * Hoeft niet persé van type Object te zijn,
	 * vul zelf in
	 */
	String suit;
	
	/**
	 * 2,3,4,5,6,7,8,9,10,b,v,k,a
	 * Hoeft niet persé van type Object te zijn,
	 * vul zelf in
	 */
	string number;
	
	/**
	 * Pretty-print deze Card als string
	 */
	public Card(String sSuit, String iNumber){
		suit = sSuit;
		number = iNumber;
		}
	public String toString(){
		return suit + " " + number;
	}
}
