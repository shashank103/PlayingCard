import java.util.ArrayList;

public class NormalCard extends BaseCard {
    public NormalCard() {
    }

    public String getSuit()
    {
        return suit;
    }
    public String getPip()
    {
        return pip;
    }
   public static ArrayList<BaseCard> generateAllCard()
    {
        ArrayList<BaseCard> temp =new ArrayList<>();
        for (char p : PIP.toCharArray()) {
            for (char s : SUIT.toCharArray()) {
                temp.add(new NormalCard(Character.toString(s), Character.toString(p)));
            }
        }
        return temp;
    }
    public void setPip(String s) {
        pip=s;
    }

    public void setSuit(String s) {
        suit=s;
    }

    NormalCard(String s, String p)
    {
        this.setPip(p);
        this.setSuit(s);
        this.setRank(p);
    }


    public boolean isSameSuit(NormalCard a, NormalCard b)
    {
        return a.getSuit()==b.getSuit();

    }
    public boolean isSamePip(NormalCard a, NormalCard b)
    {
        return a.getPip()==b.getPip();

    }

}
