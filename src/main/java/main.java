import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color");
        String color = sc.nextLine();
        System.out.println("Enter Gender");
        String Gender = sc.nextLine();
        System.out.println("Enter size");
        String size = sc.nextLine();
        System.out.println("Enter prefernce");
        String Output_prefer = sc.nextLine();

        List<String[]> TshirtData = tsdata.tshirtd(color,Gender,size);


        TshirtData = Compare.filter(TshirtData, Output_prefer.toLowerCase());
        if (TshirtData.size() == 0) {
            System.out.println("No shirt is found");
        } else {
            for (String a[] : TshirtData) {
                for (String cell : a) {
                    System.out.print(cell + " | ");
                }
                System.out.println();

            }
        }
    }
}
