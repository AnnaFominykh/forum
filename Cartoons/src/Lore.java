import java.util.ArrayList;

public class Lore extends Cartoons{
    ArrayList<Elements> elements = new ArrayList<>();

    public void add(String mc_name,String ag_name,String loc) {

        Elements el = new Elements();
        el.setLore_id(L_id());
        el.setName(mc_name);
        el.setAname(ag_name);
        el.setLocation(loc);
        boolean add = elements.add(el);
    }

    public void Del (String mc_name,String ag_name, String loc){
        String L_id=L_id();
        int L;
        for (L=0;L<elements.size(); L++);
        if (elements.get(L).getName().equals(mc_name)&&elements.get(L).getName().equals(ag_name)&&
                elements.get(L).getLore_id().equals(L_id)&& elements.get(L).getLocation().equals(loc));
        {elements.remove(L);}
    }

    public void Red(String l_id,String new_name,String new_aname, String new_loc)
    {   for (Elements EL:elements) {
                if (EL.getLore_id() == l_id) {
                    EL.setName(new_name);
                    EL.setName(new_aname);
                    EL.setRaiting(new_loc);
    }

}}}