public class SabioAct01_p2 {
    public static void main(String[] args) {
        int[] scores = {3, 9, 4, 12}; // Declare array of scores

        // This variable holds the smallest value found so far
        // First element (index 0) as our baseline to compare values
        int smallest = scores[0];

        for (int i = 0; i < scores.length; i++) { // Start - end - steps
            if (scores[i] < smallest) { // Check if smaller score
                smallest = scores[i];
            }
        }

        System.out.println("Smallest score: " + smallest); // Outputs
    }
}