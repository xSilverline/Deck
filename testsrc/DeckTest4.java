import org.junit.*;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.Assert.*;

public class DeckTest4
{
    Deck smallDeck=null;
    Deck mediumDeck=null;
    Deck x = null;
    Deck y = null;
    Deck errorDeck = null;
    @Before
    public void initiateDeck()
    {
        smallDeck = new Deck(24);
        mediumDeck = new Deck(32);
        x= new Deck(52);
        y= new Deck(52);
    }
    @Ignore
    @Test
    public void testCreateDeckWhenNumberOfCards52or32or24()
    {
        assertSame("Deck not created properly",24,smallDeck.cards.size());
        assertSame("Deck not created properly",32,mediumDeck.cards.size());
        assertSame("Deck not created properly",52,x.cards.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateDeckWithWrongNumber()
    {
        errorDeck = new Deck(10);
    }

    @Test
    public void testShufflingDeckProperly()
    {
        assertTrue("Deck are not the same", Objects.equals(Arrays.toString(x.cards.toArray()), Arrays.toString(y.cards.toArray())));
        x.Shuffling();
        assertFalse("Decks are the same", Objects.equals(Arrays.toString(x.cards.toArray()), Arrays.toString(y.cards.toArray())));
    }

    @Test(timeout = 100)
    public void testSortingDeckProperly()
    {
        assertEquals("Deck are not the same", Arrays.toString(x.cards.toArray()),Arrays.toString(y.cards.toArray()));
        x.Shuffling();
        assertNotEquals("Decks are not shuffled",Arrays.toString(x.cards.toArray()),Arrays.toString(y.cards.toArray()));
        x.Sorting();
        assertEquals("Decks are not the same", Arrays.toString(x.cards.toArray()),Arrays.toString(y.cards.toArray()));
    }
    @After
    public void deckDestroyer()
    {
        smallDeck=null;
        mediumDeck=null;
        x = null;
        y = null;

    }

    @Test
    public void testGettingTheCard() {
        x = new Deck(52);
        assertNotNull(x.ShowTopCard());
    }

}