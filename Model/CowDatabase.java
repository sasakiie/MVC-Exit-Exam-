package Model;

import java.util.List;
import java.util.ArrayList;

public class CowDatabase {
    private List<Cow> cows;

    public CowDatabase(){
        cows = new ArrayList<>() ;
        CowData();
    }

    private void CowData(){
        cows.add(new Cow("10000001", "white", 3, 5));
        cows.add(new Cow("10000002", "white", 2, 8));
        cows.add(new Cow("10000003", "white", 4, 7));
        cows.add(new Cow("10000004", "white", 5, 1));
        cows.add(new Cow("10000005", "white", 3, 9));

        cows.add(new Cow("20000001", "brown", 5, 2));
        cows.add(new Cow("20000002", "brown", 6, 3));
        cows.add(new Cow("20000003", "brown", 7, 1));
        cows.add(new Cow("20000004", "brown", 8, 6));
        cows.add(new Cow("20000005", "brown", 4, 4));

        cows.add(new Cow("30000001", "pink", 2, 10));
        cows.add(new Cow("30000001", "pink", 1, 6));
        cows.add(new Cow("30000001", "pink", 3, 4));
        cows.add(new Cow("30000001", "pink", 0, 10));
        cows.add(new Cow("30000001", "pink", 6, 3));
    }

    public Cow getCowById(String id){
        for (Cow cow : cows) {
            if (cow.getId().equals(id)) {
                return cow;
            }
        }
        return null;
    }
}
