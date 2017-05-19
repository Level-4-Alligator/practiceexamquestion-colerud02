import java.util.ArrayList;
import java.util.Collections;

/**********************************
 * Texas Hold-em! Your task is to determine if the cards in the list makes up a straight (five cards of sequential rank)
 * or not. The cards will always have values ranging from 2-14, where 14 is the ace.
 * 
 * Be aware that the ace (14) also should count as value 1!
 * 
 * The number of cards will vary, but will never be more than 7 (the board (5) + player hand (2))
 * 
 * Examples:
 * 
 * straight: 9-10-11-12-13
 * 
 * straight: 14-2-3-4-5
 * 
 * straight: 2-7-8-5-10-9-11
 * 
 * not straight: 7-8-12-13-14
 *
 ***********************/
public final class PokerHand {
	public static boolean IsStraight(ArrayList<Integer> cards) {
		int temp = 0;
		int temp2 = 0;
		int counter = 0;
		boolean tof = false;
		boolean torf = false;
		Collections.sort(cards);
		if (cards.size() < 3) {
			return false;
		}

		for (int i = 0; i < cards.size(); i++) {
			temp = cards.get(i);
			// if (temp > 7) {
			// temp = 0;
			// }
			if (temp == temp2) {
				return false;
			}
			if (temp == temp2++) {
				tof = true;
				counter++;
			}
			temp2 = temp;

		}
		if (counter < 3) {
			torf = true;
		}
		return torf;
	}
}