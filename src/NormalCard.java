public class NormalCard extends BaseCard implements Comparable<NormalCard>{
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
    public int compareTo(NormalCard o) {
        // TODO Auto-generated method stub
        return (this.rank-o.rank);

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
