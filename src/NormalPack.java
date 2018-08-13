import java.util.ArrayList;

public class NormalPack {
    public ArrayList<BaseCard> pack = new ArrayList<>();
    public static final String PIP = "23456789TJQKA";
    public static final String SUIT ="CDHS";
    NormalPack(int n){
        for (char p : PIP.toCharArray()) {
            for (char s : SUIT.toCharArray()) {
                pack.add(new NormalCard(Character.toString(s), Character.toString(p)));
            }
        }
      for(int i=0;i<n;i++)
      {
          pack.add(new JokerCard());
      }
    }

}
