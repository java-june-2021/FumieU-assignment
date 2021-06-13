import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class PuzzleJava{
    public int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            sum += array[i]; 
        }
        return sum;
    }
    public ArrayList<Integer> greaterThanTen(int[] myArray){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i = 0; i<myArray.length; i++){
            if(myArray[i] > 10){
                newArray.add(myArray[i]);
            }
        }
        return newArray;
    }

    public ArrayList<String> shuffleName(ArrayList<String> givenArray){
        ArrayList<String> nameArray = new ArrayList<String>();
        for (int j = 0; j < givenArray.size(); j++) {
            nameArray.add(givenArray.get(j));
            Collections.shuffle(nameArray);
        }
        return nameArray;
    }
    public ArrayList<String> longName(ArrayList<String> givenArray){    
        ArrayList<String> longName = new ArrayList<String>();
        for (int i = 0; i < givenArray.size(); i++){
            // if (i.length()<5){
                longName.add(givenArray.get(i));
            }
        }
        return longName;
    }

    public ArrayList randomAlphabet(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
        alphabet.add(ch);
        }
        Collections.shuffle(alphabet);
        return alphabet;
    }

        public ArrayList getRandomTen(){
            ArrayList<Integer> randomNumber = new ArrayList<Integer>();
            Random r = new Random();
            for(int i = 0; i < r.length; i++){
                randomNumber.add(r.nextInt(10)+55);
            }
            int maxNumber = nums[0];
            for (int i = 0; i <= r.length; i++) {
                if (nums[i] > maxNumber) {
                    maxNumber = nums[i];
                } 
            }

            int minNumber = nums[0];
            for (int i = 0; i <= r.length; i++){
                if (nums[i] < minNumber){
                    minNumber = nums[i];
                }
            }
            return randomNumber;
            return maxNumber;   
            return minNumber;
        }
        public ArrayList getRandomFiveCh(){
            ArrayList<String> randomString = new ArrayList<String>
            Random rCh = new Random();
            for(String j = 0; j < rCh.length; i++){
                if(String j<5){

                }
            }
        }
}

    