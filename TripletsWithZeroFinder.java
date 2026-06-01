import java.util.ArrayList;
import java.util.List;

public class TripletsWithZeroFinder {
    static void main() {
        int[] arr = new int[]{0, -1, 2, -3, 1};
        System.out.println("res: " +getTripletsWithZero(arr));
    }

    //bruteforce
    //0, 1  ,2 ,3 ,4
    //0, -1, 2, -3, 1
    public static List<ArrayList> getTripletsWithZero(int[] arr){
        int sum=1;
        List<ArrayList> res = new ArrayList();
        for(int i=0; i < arr.length ; i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1; k< arr.length;k++){
                    sum= arr[i]+arr[j]+arr[k];
                    if(sum==0){
                        ArrayList subList = new ArrayList<>();
                        subList.add(i);
                        subList.add(j);
                        subList.add(k);
                        res.add(subList);
                    }

                }
            }
        }

        return res;
    }
}
