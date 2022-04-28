import java.util.ArrayList;
import java.util.List;

public class tsdata {
    public static List<String[]> tshirtd(String color,String Gender,String size){
        csvfile in=new csvfile();
        List<String> filesname=in.filenames;
        in.listFilesForFolder(in.folder);
        List<String[]> TshirtData = new ArrayList<>();
       for(int i=0;i<filesname.size();i++){
       List<String[]> com= csvreaddata.readDataFromCustomSeparator("CSV/"+filesname.get(i));
           List<String[]> comid = search.getid(com, color, size, Gender);
           TshirtData.addAll(comid);

       }
    return TshirtData;

    }

}
