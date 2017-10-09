package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgException.DeckException;

public class DeckTest {

	@Test
	public void TestEmptyDeck() throws DeckException {
		//TODO: Build a deck, draw until you get a DeckException
		Deck d = new Deck();
		boolean bool = false;
		try {
			for(int i=0;i<52;i++)
			{
				d.Draw();
			}
			d.Draw(); 
			}
		catch(DeckException e) 
		{
			bool = true;
			assertTrue(bool);
		}
	}
	
	@Test
	public void TestDrawSuit() {
		//TODO: Build a deck, test the Draw(eSuit) method
		Deck d = new Deck();
		Card card = d.Draw(pkgEnum.eSuit.HEARTS);
		assertTrue(card.geteSuit() == pkgEnum.eSuit.HEARTS);
	}
	
	@Test
	public void TestDrawRank() {
		//TODO: Build a deck, test the Draw(eRank) method
		Deck d = new Deck();
		Card card = d.Draw(pkgEnum.eRank.FIVE);
		assertTrue(card.geteRank() == pkgEnum.eRank.FIVE);
	}
	
	public void TestDeckRankCount() {
		//TODO: Build a deck, test the DeckRankCount method
		Deck d = new Deck();
		assertEquals(d.DeckRankCount(pkgEnum.eRank.EIGHT), 4);
	}
	
	public void TestDeckSuitCount() {
		//TODO: Build a deck, test the DeckSuitCount method
		Deck d = new Deck();
		assertEquals(d.DeckSuitCount(pkgEnum.eSuit.DIAMONDS), 14);
	}

}
