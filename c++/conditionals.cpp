# include <iostream>
# include <string>

void exampleInput() {
    int x;

    std::cout << "Enter a number: ";
    std::cin >> x;

    std::cout << x << "\n";
}

void youEnter() {
    int number;
    std::cout << "Enter a number: ";
    std::cin >> number;

    if ( number % 2 == 0) {
        std::cout << "Even" << "\n";    
    } else {
        std::cout << "Odd" << "\n";
    }
    std::cout << " " << "\n";       // New line
}
   
void thisNested() {
    bool userName = false;
    bool password = true;

        if (userName) {
            if (password) {
                std::cout << "Logged in" << "\n";    
            } else {
                std::cout << "Incorrect password" << "\n";
            }
        } else {
            std::cout << "Please try again later" << "\n";
        }
}

int main () {
    int option;
    std::cout << "Enter an option (1 or 2): ";
    std::cin >> option;

    switch (option) {
    case 1:
        exampleInput();
        break;
    case 2:
        youEnter();
        break;
    default:
        std::cout << "Invalid option" << "\n";
        break;        
}
    thisNested();           // Calls function
    return 0;
}