import java.util.*;
class buysell {
    public int stockBuySell(int[] arr, int n) {
        int curmax=0,max=0;
      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                curmax = arr[j] - arr[i];
                max = Math.max(curmax,max);
            }      
        }
      }

        //       for (int i = 0; i < n; i++) {
        //     minPrice = Math.min(minPrice, arr[i]); // update min price so far
        //     maxProfit = Math.max(maxProfit, arr[i] - minPrice); // check profit
        // }

      return max; 
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        buysell obj = new buysell();
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(obj.stockBuySell(arr,n));
    }
}