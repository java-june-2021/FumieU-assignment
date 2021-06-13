import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava sumnum = new PuzzleJava();
        int[] array={3,5,1,2,7,9,8,13,25,32};
        int sum = sumnum.getSum(array);
        System.out.println(sum);   
    
        int[] anyArray={ 3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> moreThan10 = sumnum.greaterThanTen(anyArray);
        System.out.println(moreThan10);


        ArrayList<String> givenArray = new ArrayList<String>();
        givenArray.add("Nancy");
        givenArray.add("Jinichi");
        givenArray.add("Fujibayashi");
        givenArray.add("Momochi");
        givenArray.add("Ishikawa");
        System.out.println(sumnum.shuffleName(givenArray));
        System.out.println(sumnum.longName(givenArray));    
    
        ArrayList<String> alphabet = new Arraylist<String>();
        System.out.println(sumnum.randomAlphabet(alphabet));
     
        
        
    }

    
}