package ex1_1;


/*Daniel 18027156
Sorting Algo + 0^n

*/
import java.util.*;

public class arrayOperations {
    public static void main(String[] args){
        //Init array
        int[] numberArray = {1,6,7,8,13,22,12};
        int n = 0;
        //Go through array
        for(int i = 0; i <= (numberArray.length - 1); i++){
            int minNum = i;
            //System.out.println(numberArray[i]);
            //Find smallest number and replace
            for(int j = i+1; j < numberArray.length; j++){
                if(numberArray[j] < numberArray[minNum] ){
                    minNum = j;
                }
            }
         //Swapping numbers
        int swap = numberArray[i];
        numberArray[i] = numberArray[minNum];  
        numberArray[minNum] = swap;
        n+=1;
    }//Nested loop, order 0(n^2)
System.out.println(Arrays.toString(numberArray));
System.out.println("Growth function = " + (n*n));
    }
}
