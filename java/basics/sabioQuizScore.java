// Lab assignment
// i = rows
// j = columns

public class sabioQuizScore {
    public static void main(String[]args) {
        System.out.println("\n------------- Activity 2: Quiz Report -------------");

        int [][] quizScores = {                                             // Declare and create
                {87, 97, 86},
                {90, 98, 76},
                {91, 82, 94},
                {82, 92, 85},
                {88, 79, 91}};

        for (int i = 0; i < quizScores.length; i++) {                       // Counts total quiz score (Row)
            int sumRow = 0;                                                 // Set starting point to 0
            for (int j = 0; j < quizScores[0].length; j++) {
                sumRow = sumRow + quizScores[i][j];                         // Get total score of Rows
            }
            System.out.println("Student: " + (i + 1) + " Total: " + sumRow);
        }

        System.out.println();                                               // New line

        for (int j = 0; j < quizScores[0].length; j++) {                    // Counts total quiz score (Column)
            int sumCol = 0;                                                 // Set starting point to 0
            for(int i = 0; i < quizScores.length; i++) {
                sumCol = sumCol + quizScores[i][j];                         // Get total score of Column
            }
            System.out.println("Quiz: " + (j + 1) + " Total: " + sumCol);
        }

        System.out.println("---------------------------------------------------");
        int highest = quizScores[0][0];
        int hiRow = 0;
        int hiCol = 0;

        int lowest = quizScores[0][0];
        int lowRow = 0;
        int lowCol = 0;

        for (int i = 0; i < quizScores.length; i++) {
            for (int j = 0; j < quizScores[i].length; j++) {
                if (quizScores[i][j] > highest) {
                    highest = quizScores[i][j];
                    hiRow = i;
                    hiCol = j;
                }
                if (quizScores[i][j] < lowest) {
                    lowest = quizScores[i][j];
                    lowRow = i;
                    lowCol = j;
                }
            }
        }
        System.out.println("Checking ... Highest score: " + highest + " Student: " + (hiRow + 1) + " Quiz: " + (hiCol + 1));
        System.out.println("Checking ... Lowest score: " + lowest + " Student: " + (lowRow + 1) + " Quiz: " + (lowCol + 1));
        System.out.println("---------------------------------------------------");
    }
}