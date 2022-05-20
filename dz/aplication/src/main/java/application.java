import java.util.ArrayList;

public class application {
    ArrayList<ua> apl =new ArrayList<>();

    void id(String pl_id) {
        String poss = "1234567890";

        for(int b = 0; b < 5; ++b) {
            poss.charAt((int)Math.random() * (poss.length() - 0 + 0));
            System.out.println(b);

            ua new_ua= new ua();
            new_ua.SetName(pl_id);
            boolean add = apl.add(new_ua);

        }

    }

    void place(String pl_id, String place) {
        String p = "123456789";

        for(int i = 0; i < 1; ++i) {
            p.charAt((int)Math.random() * (p.length() - 0 + 0));
            System.out.println(i);
        }
        ua new_ua= new ua();
        new_ua.SetName(pl_id);
        new_ua.SetName(place);
        boolean add = apl.add(new_ua);
    }
}
