abstract class BaseCard {

    String suit;
    String pip;
    public String getSuit()
    {
        return this.suit;
    }
    public String getPip()
    {
        return this.pip;
    }
    public abstract void setSuit(String s);
    public abstract void setPip(String s);
}

