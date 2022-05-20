import java.util.ArrayList;

public class user{
    ArrayList<ua> apl =new ArrayList<>();

    void name(String name) {

        ua new_ua= new ua();
        new_ua.SetName(name);
        boolean add = apl.add(new_ua);

    }

   void id(String name) {
       String id ="";
        String s = "1234567890";

        for(int a = 0; a < 5; ++a) {
           id+=s.charAt((int)((Math.random() * (s.length() - 0)) + 0));
            System.out.println(a);
        }
       ua new_ua= new ua();
       new_ua.SetName(name);
       new_ua.SetID(id);
       boolean add = apl.add(new_ua);
    }
}
