abstract class BaseCard implements Comparable<NormalCard>{

    String suit;
    String pip;
    int rank;
    public static final String PIP = "23456789TJQKA";
    public static final String SUIT ="CDHS";
    public String getSuit()
    {
        return this.suit;
    }
    public String getPip()
    {
        return this.pip;
    }
   public void setSuit(String s)
    {
        suit=s;
    }
    public void setPip(String p)
    {
        pip=p;
    }

    void setRank(String p)
    {
        rank= PIP.indexOf(p)+2;
    }
    public int compareTo(NormalCard o) {
        // TODO Auto-generated method stub
        return (this.rank-o.rank);

    }
    int getRank()
    {
        return rank;
    }
}

