#include <stdio.h>

int main() {
    //Inputs
    // Intial variables
    char first = 'K';
    char last = 'S';

    // Age
    int age = 19;

    // Speed time
    double speedTime = 18.99;

    // Percentage
    float percentage = 85.5f;

    //Outputs
    printf("%c %c\n", first, last);
    printf("Age: %d\n", age);
    printf("Speed time: %.2lf \n", speedTime);
    printf("Battery percentage: %.1f%%\n", percentage);

    return 0;
}