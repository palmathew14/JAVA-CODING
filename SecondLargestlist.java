import java.util.*;
public class SecondLargestlist{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     ArrayList<Integer>List=new ArrayList<>();
     int n =sc.nextInt();
      int Get=sc.nextInt();
     for(int i=0;i<n;i++){
      List.add(sc.nextInt());
        }
        int largest = Integer.MIN_VALUE;
        int Second=-1;
        for(int num:List){
          if(num>largest){
            largest=num;
          }
          else if(largest>num&&Second<num){
            Second=num;
          }
        }
        System.out.println("Second largest element is:"+Second);
}
}