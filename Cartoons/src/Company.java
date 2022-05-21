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

    public void Del (String name, String loc){
        String C_id=C_ID();
        int C;
        for (C=0;C<elements.size(); C++);
        if (elements.get(C).getName().equals(name)&& elements.get(C).getCompany_id().equals(C_id)&&
                elements.get(C).getLocation().equals(loc));
        {elements.remove(C);}
    }

    public void Red(String name,String new_name, String loc, String new_loc)
    {
        String red =name.replace(name,new_name);
        String red2 =loc.replace(loc,new_loc);

        System.out.println(red);


    }

}
