import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class search {
    public static List<String[]> getid(List<String[]> company, String color, String size, String gender) {
        List<String[]> id = new ArrayList<>();
        for (String[] row : company) {
            String cid = row[0];
            if ((gender .equals(row[3])||row[3].equals("U"))&&color.equals(row[2])&&size.equals(row[4])) {
                id.add(row);
            }


        }
        return id;
    }
    public static String[] searching(String id,List<String[]> unfilter){
        String b[]=new String[0];
        for(String a[]:unfilter){
            if(a[0].equals(id))
            {
                return a;
            }
        }
        return b;
    }
    public  static void sorting (String arr[][],int col){
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Double.parseDouble(o2[col])<(Double.parseDouble(o1[col])) ){
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        });

    }

    public static void sorting(String arr[][],int col1,int col2){
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Double.parseDouble(o2[col1])<(Double.parseDouble(o1[col1]))&&Double.parseDouble(o2[col1])<Double.parseDouble(o1[col1])){
                    return 1;
                }
                else return -1;

            }
        });
    }
}

