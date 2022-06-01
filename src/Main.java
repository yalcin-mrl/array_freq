import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,count =1;
        List<Integer> list = new ArrayList<Integer>();
        System.out.print("Kaç eleman gireceksiniz: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            count =1;
            if(list.contains(i)){
                continue;
            }
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    list.add(j);
                }

            }
            System.out.println(arr[i]+" sayısı "+ count + " kere tekrar edildi");
        }
        System.out.println("Tekrar sayıları");

    }
}
