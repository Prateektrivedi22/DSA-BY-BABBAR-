import javax.management.openmbean.OpenMBeanConstructorInfoSupport;

public class ArrayProblems {

    static double getAverage(int[] arr) {
        int size = arr.length;
        int sum = 0;

        for (int i : arr) {
            sum = sum + i;
        }

        double avg = sum / (double) size;
        return avg;
    }

    static int[] MultiplyBy10(int[] arr) {
        int size = arr.length;

        int[] newArr = new int[size];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i] * 10;
        }

        return newArr;
    }
static  boolean FindTarget(int arr[], int target ){
    for(int i = 0 ; i < arr.length; i++){
        if(arr[i] == target){
            return true;
        }
    }
    return false;
}

static int GetMaximumNumber(int[] arr){
    int max = arr[0]; 
    for( int i = 0 ; i < arr.length ; i++){
        if(arr[i] > max){
            max = arr[i];

        }
         
    }
    return max ; 

} 

// return sum of positive and negative numbers 

 static int FindingSum(int [] arr ){
    int positivesum = 0; 
    int negativesum = 0;

    for (int i = 0 ; i < arr.length ; i++){
        if ( arr[i] > 0 ){
            positivesum = positivesum + arr[i] ; 

        }

        if( arr[i] < 0 ){
            negativesum = negativesum + arr[i] ;
        }
    }
    return positivesum + negativesum;
 }

 static int [] CountZeroesAndOnes(int [] arr ){
    int ZeroCount = 0 ; 
    int OnesCount = 0 ;

    for( int i = 0 ; i < arr.length ; i++){
        if(arr[i] == 0 ){
            ZeroCount++;
        }
        if(arr[i] == 1 ){
         OnesCount++;   
        }
    }
    return new int[]{ZeroCount , OnesCount};

 }

 // find first unsorted elemnt in array 


 static int FirstunsortedElement(int [] arr ){

    if(arr[0] > arr[1]){
                for( int i = 0 ; i < arr.length - 1 ; i++ ){
                     if( arr[i] < arr[i+1]){
                        return arr[i+1];

                     }
                }

    }else if (arr[0] < arr[1]){
        // ascending array 
         for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > arr[i+1]){
                return arr[i+1];
            }
         }
    }

return -1 ;

 }
 
 public static void main(String[] args) {

        int[] arr = {0 , 1 , 5 , 7, 9 , 4  };
        int target = 89 ; 


       // System.out.println(getAverage(arr));

    //     int[] result = MultiplyBy10(arr);

    //     System.out.println("printing ans arr:");

    //     for (int i : result) {
    //         System.out.println(i);
    //     }

    //     System.out.println(" target found : " + FindTarget(arr , target ));

    // System.out.println(GetMaximumNumber(arr));

     //System.out.println(FindingSum(arr));

    int ans [] = CountZeroesAndOnes(arr);



    System.out.println("ZEROES  COUNT : " + ans[0]);
    System.out.println("ones count :" + ans[1] );


    System.out.println(FirstunsortedElement(arr));
    }
}