import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.Assert.assertNotEquals;

public class DeckTest3 extends TestCase
{


    public void testCreateDeckWhenNumberOfCards52or32or24()
    {
        assertSame("Deck not created properly",24,new Deck(24).cards.size());
        assertSame("Deck not created properly",32,new Deck(32).cards.size());
        assertSame("Deck not created properly",52,new Deck(52).cards.size());
    }

    public void testIllegalArgumentExceptionOnDeckCreation()
    {
        Deck tryDeck;
        try
        {
            tryDeck=new Deck(10);
            fail("Deck shouldnt be created");
        }
        catch(IllegalArgumentException success)
        {
        }
    }

    public void testDeckHasValue()
    {
        assertNotNull(new Deck(24));
        assertNotNull(new Deck(32));
        assertNotNull(new Deck(52));
    }


    public void testShufflingDeckProperly()
    {
        Deck x = new Deck(52);
        Deck y = new Deck(52);

        assertTrue("Deck are not the same", Objects.equals(Arrays.toString(x.cards.toArray()), Arrays.toString(y.cards.toArray())));
        x.Shuffling();
        assertFalse("Decks are the same", Objects.equals(Arrays.toString(x.cards.toArray()), Arrays.toString(y.cards.toArray())));
    }


    public void testSortingDeckProperly()
    {
        Deck x = new Deck(52);
        Deck y = new Deck(52);

        assertEquals("Deck are not the same", Arrays.toString(x.cards.toArray()),Arrays.toString(y.cards.toArray()));
        x.Shuffling();
        assertNotEquals("Decks are not shuffled",Arrays.toString(x.cards.toArray()),Arrays.toString(y.cards.toArray()));
        x.Sorting();
        assertEquals("Deck are not the same", Arrays.toString(x.cards.toArray()),Arrays.toString(y.cards.toArray()));
    }

}