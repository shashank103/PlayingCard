import java.util.ArrayList;
import java.util.Collections;

public class NormalDeck extends NormalPack {
    ArrayList<NormalCard> deck = new ArrayList<>();
    NormalDeck(int n)
    {
        for( int i=0;i<n;i++)
        {
            NormalPack temp= new NormalPack();
            deck.addAll(temp.pack);
        }
    }
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
}
