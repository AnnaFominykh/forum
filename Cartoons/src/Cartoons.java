

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

    public void Del (String name, String rait){
        String C_id=C_ID();
        String l_id=L_id();
        String p_id=P_id();
        String c_id=c_ID();
        int d;
        for (d=0;d<Cartoons.size(); d++);
        if (Cartoons.get(d).getCart_id().equals(c_id)&&Cartoons.get(d).getName().equals(name)&& Cartoons.get(d).getCompany_id().equals(C_id)&&
                Cartoons.get(d).getRaiting().equals(rait)&& Cartoons.get(d).getLore_id().equals(l_id)&&
            Cartoons.get(d).getPlot_id().equals(p_id));
        {Cartoons.remove(d);}
    }

    public void Red(String c_id, String new_name, String new_rait)
    {
        for (Cartoons_dt cart:Cartoons) {
            if (cart.getCart_id() == c_id) {
                cart.setName(new_name);
                cart.setRaiting(new_rait);
            }

        }}}








