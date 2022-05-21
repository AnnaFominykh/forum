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

    public void Red(String mc_name,String new_mname,String ag_name,String new_aname, String loc, String new_loc)
    {
        String red =mc_name.replace(mc_name,new_mname);
        String red2 = ag_name.replace(ag_name,new_aname);
        String red3 =loc.replace(loc,new_loc);

    }

}