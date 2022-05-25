import java.util.ArrayList;

public class Lore extends Cartoons{
    ArrayList<Elements> elements = new ArrayList<>();

    public void add(String mc_name,String ag_name,String loc) {

        Elements el = new Elements();
        el.setLore_id(L_id());
        el.setCName(mc_name);
        el.setAname(ag_name);
        el.setLocation(loc);
        boolean add = elements.add(el);
    }

    public void Del (String mc_name,String ag_name, String loc){
        String L_id=L_id();
        int L;
        for (L=0;L<elements.size(); L++);
        if (elements.get(L).getCname().equals(mc_name)&&elements.get(L).getAname().equals(ag_name)&&
                elements.get(L).getLore_id().equals(L_id)&& elements.get(L).getLocation().equals(loc));
        {elements.remove(L);}
    }

    public void Red(String L_id,String new_Cname,String new_aname, String new_loc)
    {   for (Elements EL2:elements) {
        if (EL2.getLore_id() == L_id) {
            EL2.setCName(new_Cname);
            EL2.setAname(new_aname);
            EL2.setLocation(new_loc);
        }
    }}
        public void out(String l_id,String mc_name, String ag_name, String loc)
        {
            l_id=L_id();
            int l;
            for (l=0;l<elements.size();l++);
            if (elements.get(l).getCname().equals(mc_name)&&elements.get(l).getAname().equals(ag_name)&&
                    elements.get(l).getLore_id().equals(l_id)&& elements.get(l).getLocation().equals(loc));
            {System.out.println(" | "+elements.get(l).getLore_id()+" | " +elements.get(l).getCname()+" | "
                    + elements.get(l).getAname()+" | " + elements.get(l).getLocation()+" | ");}

        }


    }}}