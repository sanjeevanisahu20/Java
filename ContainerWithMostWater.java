public class ContainerWithMostWater {
    int length;

    static void main() {
        System.out.println("Hello");
        int arr[] = new int[]{3, 1, 2, 4, 5};
        int arr1[] = new int[]{2, 1, 8, 6, 4, 6, 5, 5};
        //int result = getMostWater(arr);
        int result =  getMostWaterWithTwoPointer(arr1);
        System.out.println(result);
    }

    public ContainerWithMostWater(int length){
        this.length=length;
    }

    //brute force
    public static Integer getMostWater(int[] arr){
        int sum=0;
        int width=0;
        int min=0;

        for(int i=0; i < arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                width= j-i;
                min = Math.min(arr[i],arr[j]);
                System.out.println("width :"+width + " min :"+min + " sum :"+sum);
                if(sum<width*min){
                    sum=width*min;
                }

            }
        }
        //0, 1, 2, 3, 4
        //3, 1, 2, 4, 5}
      /*  System.out.println("maxInd : "+maxInd+" secInd : "+secInd+" secMaxVal : "+secMaxVal+" maxVal : "+maxVal);
        sum = (maxInd-secInd) * secMaxVal;*/
        return sum;
    }

    public static Integer getMostWaterWithTwoPointer(int[] arr){
        int sum=0;
        int width=0;
        int dis=0;
        int left=0,right=arr.length-1;
        while(right>left){
            width= right-left;
            dis = Math.min(arr[left],arr[right]);
            if(sum<dis*width){
                sum=dis*width;
            }
            if(arr[left]<arr[right]){
                 ++left;
            }else{
                --right;
            }
        }

        //0, 1, 2, 3, 4
        //3, 1, 2, 4, 5}
      /*  System.out.println("maxInd : "+maxInd+" secInd : "+secInd+" secMaxVal : "+secMaxVal+" maxVal : "+maxVal);
        sum = (maxInd-secInd) * secMaxVal;*/
        return sum;
    }
}
