
public class ArrayProblemPart2 {

    static void reverseAnArray(int arr[]) {

        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }


 


    static void shifting(int arr[]){

    int n = arr.length;

  int temp = arr [n-1];


   

    for(int i =n-1; i > 0 ; i--){

        arr[i ] = arr[i - 1  ];




    }

    arr[0] = temp ;

    for(int i : arr){
        System.out.println(i);
    }
   
}

// print extreme elements in an alternate manner 

static void ExtremeEleemnts( int arr[]){

int n = arr.length; 
int i = 0 ; 
int j = n-1 ;

for (int k = 0 ; k < n ;  k++){
    System.out.println(arr[i]);
    i++;
    System.out.println(arr[j]);
    j--;
    if(i == j ){
        System.out.println(arr[i]);
        break;
    }

  
    
}




}


// identify elements with highest and lowest frequency 


// find the mode of the array 

static void getMode(int arr []){

    HashMap<Integer , Integer> freq = new HashMap<>();

}
 




    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        //  reverseAnArray(arr);
        // shifting(arr);
        ExtremeEleemnts(arr);
    }
}
 

