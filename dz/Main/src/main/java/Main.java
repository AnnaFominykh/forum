import java.util.ArrayList;

public class Main {
    public void main(String[] args) {
        ArrayList<ua> apl = new ArrayList<>();
        user u = new user();
        application a = new application();

        u.id("Фриск");
        u.id("Чара");
        u.id("Крис");
a.place("","");
        a.place("","");
        a.place("","");
        for (int s = 0; s < u.apl.size(); s++) {
            u.apl.get(s).GetID();
        }
        for (int s = 0; s < u.apl.size(); s++) {
            System.out.println(u.apl.get(s).GetID());
        }

        for (int p = 0; p < a.apl.size(); p++) {
            System.out.println(a.apl.get(p).GetID());
        }

        for (int i = 0; i < a.apl.size(); i++) {
            System.out.println(a.apl.get(i).GetPlace());
        }
    }
}
