

import java.util.ArrayList;

public class Cartoons {
    int id=1;

    ArrayList<Cartoons_dt> Cartoons = new ArrayList<>();


    public String C_ID()
    {

        String C_id="";
        int C_ID;
        C_ID=id;
        id+=1;
        C_id+=C_ID;

        return C_id;
    }

    public String c_ID()
    {

        String cart_id="";
        int c_ID;
        c_ID=id;
        id+=1;
        cart_id+=c_ID;

        return cart_id;
    }

    public String L_id()
    {
        String l_id="";
        int L_ID;
        L_ID=id;
        id+=1;
        l_id+=L_ID;

        return l_id;
    }

    public String P_id()
    {

        String p_id="";
        int P_ID;
        P_ID=id;
        id+=1;
        p_id+=P_ID;

        return p_id;
    }


    public void add(String name,String rait) {

        Cartoons_dt C_dt = new Cartoons_dt();
        C_dt.setCart_id(c_ID());
        C_dt.setName(name);
        C_dt.setRaiting(rait);
        boolean add = Cartoons.add(C_dt);
    }

    public void Del (String c_id, String name, String rait){

        int d;
        for (d=0;d<Cartoons.size(););
        if (Cartoons.get(d).getCart_id().equals(c_id)&&Cartoons.get(d).getName().equals(name)
                &&Cartoons.get(d).getRaiting().equals(rait));
        {Cartoons.remove(d);}
    }

    public void Red (String c_id, String new_name, String new_rait)
    {
        for (Cartoons_dt cart:Cartoons) {
            if (cart.getCart_id() == c_id) {
                cart.setName(new_name);
                cart.setRaiting(new_rait);
            }}}

            public void out(String c_id, String name, String rait)
            {String C_id=C_ID();
                String l_id=L_id();
                String p_id=P_id();
                c_id=c_ID();
                int co;
                for (co=0;co<Cartoons.size();co++);
                if (Cartoons.get(co).getCart_id().equals(c_id)&&Cartoons.get(co).getName().equals(name)
                        &&Cartoons.get(co).getRaiting().equals(rait));
                {System.out.println(Cartoons.get(co).getCart_id()+" | "+Cartoons.get(co).getName()+" | "
                        +" | "+ Cartoons.get(0).getRaiting()+" | ");}

            }
        }








