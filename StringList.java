import java.util.*;
public class StringList {
    public static void main(String[] args) {
        ArrayList<String>List=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<=5;i++) {
        String name=sc.nextLine();
        List.add(name);
}
System.out.println(List);
}
}