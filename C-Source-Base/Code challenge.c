# include <stdio.h>

int main() {
    // Student 1
    char name1[] = "Rony";
    char id1[] = "432876";
    float score1 = 90.5;
    char grade1 = 'A';

    // Student 2
    char name2[] = "Christiano";
    char id2[] = "676767";
    float score2 = 85.0;
    char grade2 = 'B';

    // Student 3
    char name3[] = "Craig";
    char id3[] = "437664";  
    float score3 = 78.0;
    char grade3 = 'C';

    // Output
    
    // Student 1
    printf("Student 1:\n");
    printf("Name: %s\n", name1);
    printf("ID: %s\n", id1);
    printf("Score: %.2f\n", score1);
    printf("Grade: %c\n\n", grade1);

    // Student 2
    printf("Student 2: \n");
    printf("Name: %s\n", name2);
    printf("ID: %s\n", id2);
    printf("Score: %.2f\n", score2);
    printf("Grade: %c\n\n", grade2);

    // Student 3
    printf("Student 3: \n");
    printf("Name: %s\n", name3);
    printf("ID: %s\n", id3);
    printf("Score: %.2f\n", score3);
    printf("Grade: %c\n\n", grade3);

    return 0;
}