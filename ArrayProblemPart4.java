
 import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

public class ArrayProblemPart4 {

   // Given an array of integers nums and an integer target
    public static int[] TwoSum(int[] arr, int target) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {

                    int[] ans = {i, j};
                    return ans;
                }
            }
        }

        return new int[0];
    }


  //  THREE SUM 

    public static int[] ThreeSum(int arr[], int target) {

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        return new int[] {i, j, k};
                    }
                }
            }
        }

        return new int[0];
    }

    public static int  RemoveDuplicates(int arr []  ){
           int n = arr.length ; 

           int i = 0 ; 
           int j = 1 ; 
            while(j < n){
            if (arr[i] == arr[j]){
                j++;
            }
            else{
                i++;
                arr[i] = arr[j];
                j++;
     
            
            }
        }
        return i +1 ;

   

   
    }

    public static int FirstRepeatingElement(int[] arr){

        // brute force approach 

// int n = arr.length ; 
//         int i = 0 ; 
//         int j = i +  1 ; 

//         for( i = 0 ; i < n; i++){
//             for( j = i+1 ; j<n; j++){
//                 if(arr[i] == arr[j]){
//                     System.out.println(arr[i]);
//                     return arr[i];
//                 }
//             }
//         }
//         return -1 ;



        //  through hashmap 

HashMap<Integer, Integer> freq = new HashMap<>();

// freq store 
for(int i : arr){
    freq.put(i , freq.getOrDefault(i , 0) +1);

}

for(int num : arr){
    if(freq.get(num)> 1){
        return num;
    }
}
return -1 ; 
    } 
    public static void main(String[] args) {

     int  []arr = {10, 20, 30, 20, 10};
        int target = 70;

      

        int[] ans = TwoSum(arr, target);

        System.out.println(Arrays.toString(ans));

        int result[] = ThreeSum(arr, target);
        System.out.println(Arrays.toString(result));

int  solution = RemoveDuplicates(arr);
System.out.println(solution);

int x = FirstRepeatingElement(arr);
System.out.println(x);
    }
}
















