import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Cartoons_dt> Cartoons = new ArrayList<>();
    ArrayList<Elements> elements = new ArrayList<>();
    ArrayList<Plot_el> plot = new ArrayList<>();

    Cartoons Ct = new Cartoons();
    Company E1 = new Company();
    Lore E2 = new Lore();
    Plot p = new Plot();

    Ct.add("Encanto",	"4.5");
    Ct.add("Onward", "4.5");
    Ct.add("Monsters, Inc.","5");

    E1.add("Disney", "US");
    E1.add("Pixar","US");

    E2.add("Mirabell","Alma","Columbia");
    E2.add("Iandore",	" - ","New Mushroomton");
E2.add("Sullivan"," Randall" , "Monsters Inc.");

p.add("Stop Craks","Cassita start cracking","Destruction of Cassita", "Rebilding Cassita");
p.add("Summon M.C. father","Part of wand breaks","Fighting whith dragon","Summoning M.C. father");
p.add("Return girl home","Girl appeared in Monster Inc.",
        "Fight whith Randall","Monster Inc. start work at laughter");

        for (int c= 0; c <  Ct.Cartoons.size(); c++){
            Ct.Cartoons.get(c).getCart_id();
        }

        for (int C= 0; C < Ct.Cartoons.size(); C++){
            Ct.Cartoons.get(C).getCompany_id();
        }
        for (int c= 0; c < Ct.Cartoons.size(); c++){
            Ct.Cartoons.get(c).getCart_id();
        }
        for (int P= 0; P < Ct.Cartoons.size(); P++){
            Ct.Cartoons.get(P).getPlot_id();
        }

        System.out.println("  ");
        System.out.println(" | "+E1.elements.get(0).getCompany_id()+" | " + E1.elements.get(0).getName()+" | "+
                E1.elements.get(0).getLocation()+" | ");
        System.out.println(" | "+E1.elements.get(1).getCompany_id()+" | " + E1.elements.get(1).getName()+" | "+
                E1.elements.get(1).getLocation()+" | ");
        System.out.println("  ");
        for (int L= 0; L < Ct.Cartoons.size(); L++){
            Ct.Cartoons.get(L).getLore_id();
        }

        System.out.println(" | "+E2.elements.get(0).getLore_id()+" | " + E2.elements.get(0).getName()+" | "
                + E2.elements.get(0).getAname()+" | " + E2.elements.get(0).getLocation()+" | ");
        System.out.println(" | "+E2.elements.get(1).getLore_id()+" | " + E2.elements.get(1).getName()+" | "
                + E2.elements.get(1).getAname()+" | "+ E2.elements.get(1).getLocation()+" | ");
        System.out.println(" | "+E2.elements.get(2).getLore_id()+" | " + E2.elements.get(2).getName()+" | "
                + E2.elements.get(2).getAname()+" | "+ E2.elements.get(2).getLocation()+" | ");

        System.out.println("  ");

        System.out.println(" | "+p.plot.get(0).getPlot_id()+" | " + p.plot.get(0).getBase()+" | "
                + p.plot.get(0).getBeggining()+" | " + p.plot.get(0).getThe_Climax()+" | "
                + p.plot.get(0).getEnding()+" | ");
        System.out.println(" | "+p.plot.get(1).getPlot_id()+" | " + p.plot.get(1).getBase()+" | "
                + p.plot.get(1).getBeggining()+" | " + p.plot.get(1).getThe_Climax()+" | "
                + p.plot.get(1).getEnding()+" | ");
        System.out.println(" | "+p.plot.get(2).getPlot_id()+" | " + p.plot.get(2).getBase()+" | "
                + p.plot.get(2).getBeggining()+" | " + p.plot.get(2).getThe_Climax()+" | "
                + p.plot.get(2).getEnding()+" | ");

        System.out.println("  ");



        System.out.println(Ct.Cartoons.get(0).getCart_id()+" | "+Ct.Cartoons.get(0).getName()+" | " + E1.elements.get(0).getCompany_id()+" | "+
                Ct.Cartoons.get(0).getRaiting()+" | " +E2.elements.get(0).getLore_id()+" | "
                +p.plot.get(0).getPlot_id());
        System.out.println(Ct.Cartoons.get(1).getCart_id()+" | "+Ct.Cartoons.get(1).getName()+" | " + E1.elements.get(1).getCompany_id()+" | "+
                Ct.Cartoons.get(1).getRaiting()+" | " +E2.elements.get(1).getLore_id()+" | "
                + p.plot.get(1).getPlot_id());
        System.out.println(Ct.Cartoons.get(2).getCart_id()+" | "+Ct.Cartoons.get(2).getName()+" | " + E1.elements.get(1).getCompany_id()+" | "+
                Ct.Cartoons.get(2).getRaiting()+" | " +E2.elements.get(2).getLore_id()+" | "
                + p.plot.get(2).getPlot_id());

        System.out.println("  ");

        Ct.Red(Ct.Cartoons.get(0).getCart_id(), "Alladin","5");

        System.out.println(Ct.Cartoons.get(0).getName()+" | " + E1.elements.get(0).getCompany_id()+" | "+
                Ct.Cartoons.get(0).getRaiting()+" | " +E2.elements.get(0).getLore_id()+" | "
                +p.plot.get(0).getPlot_id());

E1.Red(E1.elements.get(0).getCompany_id(),"Warner Br.","US");
        System.out.println(" | "+E1.elements.get(0).getCompany_id()+" | " + E1.elements.get(0).getName()+" | "+
                E1.elements.get(0).getLocation()+" | ");

E2.Red(E2.elements.get(0),"");



}}
