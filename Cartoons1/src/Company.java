import java.util.ArrayList;

public class Company extends Cartoons{
    ArrayList<Elements> elements = new ArrayList<>();



    public void add(String name,String loc) {

            Elements el = new Elements();
            el.setCompany_id(C_ID());
            el.setName(name);
            el.setLocation(loc);

boolean add = elements.add(el);
        }

    public void Del (String C_id,String name, String loc){
        int C;
        for (C=0;C<elements.size(););
        if (elements.get(C).getName().equals(name)&& elements.get(C).getCompany_id().equals(C_id)&&
                elements.get(C).getLocation().equals(loc));
        {elements.remove(C);}
    }

    public void Red(String C_id, String new_name, String new_loc) {
        for (Elements EL1: elements) {
            if (EL1.getCompany_id() == C_id) {
                EL1.setName(new_name);
               EL1.setRaiting(new_loc);
            }}}

            public void out(String C_id,String name, String loc)
            {
        int o;
                for (o=0;o<elements.size();o++);
                if (elements.get(o).getName().equals(name)&& elements.get(o).getCompany_id().equals(C_id)&&
                        elements.get(o).getLocation().equals(loc));
                {System.out.println(" | "+elements.get(o).getCompany_id()+" | " + elements.get(0).getName()+" | "+
                        elements.get(o).getLocation()+" | ");}

            }

        }


