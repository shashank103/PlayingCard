import java.util.ArrayList;

public class NormalPack extends NormalCard {
    public ArrayList<NormalCard> pack = new ArrayList<>();
    NormalPack(){
        for (char p : PIP.toCharArray()) {
            for (char s : SUIT.toCharArray()) {
                pack.add(new NormalCard(Character.toString(s), Character.toString(p)));
            }
        }
    }

}
