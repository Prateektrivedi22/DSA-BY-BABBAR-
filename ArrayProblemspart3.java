public class ArrayProblemspart3 {

    static void zerosAndOnes(int arr[]){
 int n = arr.length ;
        int i = 0 ; 
        int j = n-1 ; 
        

       

            while(i<=j){
            if (arr[i] == 1 && arr[j] == 0 ){
                int temp = arr[j]; 
                arr[j] = arr[i];
                arr[i] = temp ; 

            } 


            if (arr[i] == 0 ){
                i++;
            }
            if(arr[j] == 1 ){
                j--;
            }
        }
    
        for(int k = 0 ; k<n ; k++){
            System.out.println(arr[k]);
        }

    }

    // given an array nums containing n distinct numbers taken from 0 , 1, 2, ... n , find the one that is missing from the array 

static int MissingNumber(int [] arr ){

//     int n = arr.length ; 

//     int ActualSum = n *(n+1)/2 ; 
//     int ObservedSum = 0 ; 
//     for(int i =0 ; i< n ;i++){

//   ObservedSum = ObservedSum + arr[i];


// }

// int MissingNumber = ActualSum - ObservedSum ; 

// return MissingNumber;
// }

// SECOND APPROACH 


// xor with all the array elemnts 

int xorSum = 0;

for(int n : arr){
    xorSum = xorSum ^ n ; 
}
// xor with all the elements in the range

int n = arr.length ; 
for(int i = 0 ; i<= n ;  i ++){
    xorSum = xorSum ^ i ; 

}

// ans ajaayega 
return xorSum;


}

// EACH ELEMNT APPEARS TWICE , EXCEPT  FOR THAT ONE DISTINCT ELEMNT THAT APPEARS ONLY ONCE 


public int UniqueElement(int arr [] ){
    

                                                               

}




    public static void main(String [] args){
        int[] arr = {0 ,1, 3, 4  };
        // zerosAndOnes(arr);
       int result =  MissingNumber(arr);
       System.out.println(result);


        
    }

}