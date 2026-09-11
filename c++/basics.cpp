# include <iostream>
# include <string>

int main() {
    std::cout << "Hello, World!" << "\n";

    std::cout << "C++ DATA TYPES" << "\n";
    // types
    int number = 67;
    double decimal = 67.67;
    std::string name = "Kenshi";
    char initial = 'k';
    bool isTrue = true;
    bool isFalse = false;

    //Output
    std::cout << number << "\n";
    std::cout << decimal << "\n";
    std::cout << name << "\n";
    std::cout << initial << "\n";
    std::cout << isTrue << "\n";
    std::cout << isFalse << "\n";
    std::cout << " " << "\n"; // new line

    int x = 64;
    int y = 74;

    bool check1 = (x > y);
    std::cout << check1 << "\n";
    bool check2 = ( x != y);
    std::cout << check2 << "\n";
    bool check3 = (x <= y);
    std::cout << check3 << "\n";
    std::cout << " " << "\n"; // new line
    
    // &&, ||, !
    bool switch1 = true;
    bool switch2 = false;

    bool andGate = (switch1 && switch2);
    std::cout << andGate << "\n";

    bool test = (switch1 && !switch2); // ! = flip value
    std::cout << test << "\n";
    std::cout << " " << "\n"; // new lines

    for(int i = 0; i < 5; i++) {
        std::cout << "hello" << "\n";

    }






    return 0;
}
