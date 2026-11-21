public class sabioQST {
    public static void main(String[] args) {
        System.out.println("\n------- Activity 1: Quiz Scores Table -------");

        int [][] scores = {                                                 // Declare and create
                {80, 90, 70},
                {85, 75, 95},
                {60, 88, 86}};

        int count = 0;
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {                    // will crash if <=
                System.out.print(scores[i][j] + " ");                       // Print score
                total = total + scores[i][j];                               // Add to total
                count++;                                                    // Increment count
            }
            System.out.println();                                           // New line
        }



        double average = (double) total / count;

        System.out.println("---------------------------------------------");
        System.out.println("Number of scores: " + count);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("---------------------------------------------");
    }
}