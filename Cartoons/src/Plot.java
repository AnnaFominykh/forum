import java.util.ArrayList;

public class Plot extends Cartoons{
    ArrayList<Plot_el> plot = new ArrayList<>();

    public void add(String base, String begg, String max, String end) {

        Plot_el pl = new Plot_el();

        pl.setPlot_id(P_id());
        pl.setBase(base);
        pl.setBeggining(begg);
        pl.setThe_Climax(max);
        pl.setEnding(end);
        boolean add = plot.add(pl);
    }
    public void Del (String base, String begg, String max, String end){
        String p_id = P_id();
        int P;
        for (P=0;P<plot.size(); P++);
        if (plot.get(P).getPlot_id().equals(p_id)&& plot.get(P).getBase().equals(base)&&
                plot.get(P).getBeggining().equals(begg)&& plot.get(P).getThe_Climax().equals(max)&&
                plot.get(P).getEnding().equals(end));
        {Cartoons.remove(P);}
    }

    public void Red(String base, String new_base, String begg, String new_beg,
                    String max, String new_max, String end, String new_end)
    {
        String red =base.replace(base,new_base);
        String red2 =begg.replace(begg,new_beg);
String red3 = max.replace(max, new_max);
String red4 = end.replace(end, new_end);
    }
}
