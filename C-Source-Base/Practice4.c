# include <stdio.h>

int main() {
    printf("Hello, C!\n\n");

    long l = 83000000L;
    printf("Long: %ld\n\n", l);

    long long ll = 8300000000000LL;
    printf("Long Long: %lld\n\n", ll);


    // Input 
    int Salary = 50000;
    int Tax = 5000;
    int totalSalary = Salary - Tax;

    //Output
    printf("Salary: %d\n", Salary);
    printf("Tax: %d\n", Tax);
    printf("Total Salary: %d\n\n", totalSalary);

    // C Data types 
    printf("Data types sizes\n");
    int myInt; 
    float myFloat;
    double myDouble;
    char myChar;

    // Printing Data types sizes (Bytes)
    printf("%zu\n", sizeof(myInt));
    printf("%zu\n", sizeof(myFloat));
    printf("%zu\n", sizeof(myDouble));
    printf("%zu\n", sizeof(myChar));

    


    return 0;
}