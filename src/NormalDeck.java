import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class NormalDeck {
    ArrayList<BaseCard> deck = new ArrayList<>();
    NormalDeck(int numPack, int numJoker)
    {
        for( int i=0;i<numPack;i++)
        {
            NormalPack temp= new NormalPack(numJoker);
            deck.addAll(temp.pack);
        }
    }
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
    public ArrayList<BaseCard> getNCards(int n) {

        Random random = new Random();

        ArrayList<BaseCard> nCards = new ArrayList<>();

        HashSet<Integer> alreadyUsed = new HashSet<>();

        for (int i = 0; i < n; i++) {

            int randomIndex = random.nextInt(deck.size());

            while (alreadyUsed.contains(randomIndex)) {

                randomIndex = random.nextInt(deck.size());
            }
            alreadyUsed.add(randomIndex);

            nCards.add(deck.get(randomIndex));

            deck.remove(randomIndex);
        }

        return nCards;



    }
}
