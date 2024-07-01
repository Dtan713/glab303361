public class GLAB30361part5 {
    public static void main(String[] args) {
// Declare variable
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        int sumSq = 0;
        double mean, stdDev;

        // compute sum and square-sum using loops
        for(int i = 0; i < marks.length; ++i) {
            sum += marks[i];
            sumSq += marks[i] * marks[i];}
        mean = (double)sum / marks.length;
        stdDev = math.sqrt((double)sumSq / marks.length - mean * mean);

        //print results
        System.out.println("Mean is: %.2f%n, mean");
        System.out.println("Standard deviation is: %2f%n , stdDev");



    }
}


