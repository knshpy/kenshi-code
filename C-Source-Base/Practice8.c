# include <stdio.h>

int main() {
    // C switch

    int Trump = 1;
    int Macron = 2;
    int Putin = 3;
    int Xi = 4;
    int Scholz = 5;

    int Destinations = Macron; // Example: Selected destination is London

    switch (Destinations) {
        case 1:
            printf("Paris\n");
            break;
        case 2:
            printf("London\n");
            break;
        case 3:
            printf("Berlin\n");
            break;
        case 4:
            printf("Rio de Janeiro\n");
            break;
        case 5:
            printf("Amsterdam\n");
            break;
        default:
            printf("Invalid destination\n");              
    }

    printf("\nDestination's Code: \n");
    printf("Trump: %d\n", Trump);
    printf("Macron: %d\n", Macron);
    printf("Putin: %d\n", Putin);
    printf("Xi: %d\n", Xi);
    printf("Scholz: %d\n", Scholz);

    return 0;
}