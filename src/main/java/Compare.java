import java.util.*;

public class Compare {
    public static List<String[]> filter(List<String[]> unfilter, String OutputPrefer) {

        String[][] a=new String[unfilter.size()][8];
        for(int i=0;i< unfilter.size();i++){
           String[]c= unfilter.get(i);
            for(int j=0;j<8;j++){
                a[i][j]=c[j];
            }
        }


        if (OutputPrefer.equals("price")) {

          search.sorting(a,5);
        }
        else if(OutputPrefer.equals("rating")){
            search.sorting(a,6);
        }
        else{
search.sorting(a,5,6);
        }


        List<String[]> filter=new ArrayList<>();
        for(String[] b:a){
            filter.add(b);
        }
        return filter;
    }


}