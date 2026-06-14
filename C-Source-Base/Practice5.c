# include <stdio.h>

int main() {
    // Unsigned means int should be positive not negative
    // byte size differ to system whether its new or old one

    // C exnteded data types
    short int a = 32767; // 2 bytes
    unsigned short int b = 65535; // 2 or 4 bytes
    long int c = 312312312; // 4 or 8 bytes
    long long int d = 90123123132; // 8 bytes
    unsigned long int e = 314324234;  // 4 0r 8 bytes 
    unsigned long long int f = 8931231231U; // 8 bytes
    long double g = 3.14159265358979323846L; // 8 or 12 or 16 bytes 

    // Outputs
    printf("Short int: %d\n", a);
    printf("Unsigned short int: %u\n", b);
    printf("Long int: %ld\n", c);
    printf("Long Long int: %lld\n", d);
    printf("Unsigned long int: %lu\n", e);
    printf("Unsigned long long int: %llu\n", f);
    printf("Long double: %Lf\n", g);




    return 0;
}