import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(multi_binary_search(500,1000000));
    }

    public static float multi_binary_search(int UpperBound, float NumberOfTimes){
        float MySum = 0;
        for(int i = 0; i< NumberOfTimes; i++){
            MySum += binary_search(UpperBound);
        }
        return (MySum/NumberOfTimes);
    }

    public static int binary_search(int UpperBound) {
//        System.out.println("This is a Java implementation of the binary search method");
        Random rand = new Random();
        int GuessNumber = UpperBound/2;
        int LowerBound = 0;
        int RandomNumber = rand.nextInt(UpperBound);
        int Counter = 0;
//        System.out.println("Our number is between 0 and " + UpperBound);
//        System.out.println("Our target number is " + RandomNumber);
//        System.out.println("Our guess number is " + GuessNumber);
        while(GuessNumber != RandomNumber) {
            Counter++;

            if (GuessNumber > RandomNumber){
                UpperBound = GuessNumber;
            } else {
                LowerBound = GuessNumber;
            }
            GuessNumber = ((UpperBound - LowerBound)/2) + LowerBound;
//            System.out.println("Our guess number is " + GuessNumber);
        }
//        System.out.println(GuessNumber + " is our number!");
        return Counter;
    }
}
