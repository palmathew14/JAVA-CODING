import java.util.*;
public class Arraylist {
    public static void main(String[] args){
        ArrayList<Integer>List=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            int a=sc.nextInt();
            List.add(a);
        }
    }
}
