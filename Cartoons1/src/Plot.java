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

    public void Red(String p_id,String new_base, String new_beg,
                   String new_max, String new_end)

        {for (Plot_el pl: plot) {
            if (pl.getPlot_id() == p_id) {
                pl.setBase(new_base);
                pl.setBeggining(new_beg);
                pl.setThe_Climax(new_max);
                pl.setEnding(new_end);

    }}}}

