# include <stdio.h>

int main() {
    // Input and variables
    char University[] = "National University";
    char name[] = "Kenshi Sabio";
    int number = 20256767;
    
    // Operator
    int x = 10;
    int y = 7;

    int sum = x + y;
    int difference = x - y;
    int product = x * y;
    double quotient = (double)x / y;

    // Output
    printf("University: %s\n", University);
    printf("Name: %s\n", name);
    printf("Number: %d\n", number);

    printf("\n"); // Space

    // Operator
    printf("Sum: %d\n", sum);
    printf("Difference: %d\n", difference);
    printf("Product: %d\n", product);
    printf("Quotient: %.2f\n", quotient);

    return 0;
}