import java.util.ArrayList;

public class Pack {
    public ArrayList<BaseCard> pack = new ArrayList<>();

    Pack(int n){
        pack= NormalCard.generateAllCard();
      for(int i=0;i<n;i++)
      {
          pack.add(new JokerCard());
      }
    }

}
