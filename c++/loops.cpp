# include <iostream>
# include <string>

void loop() {
    for (int i = 0; i < 5; i++) {
        std::cout << "Hello" << "\n";
    }
}

void nestedLoop() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                std::cout << "Hello " << "";
            }
            std::cout << " " << "\n";       // New line
        }
    }
}

void whileLoop() {
    int number = 67;
    int x;

    std::cout << "Enter a number: ";
    std::cin >> x;

    while(true) {
        if (x == number) {
        std::cout << "Yes" << "\n";
        break;
        } else {
        std::cout << "No" << "\n";
        break;
        }
    }
}

void doWhile() {
    int correctPin = 2067;
    int pin;
    int attempt = 3;

    do {
        std::cout << "Enter your pin: ";
        std::cin >> pin;
        attempt--;

    } while (pin != correctPin && attempt > 0);
        if (pin == 2067) {
            std::cout << "LoggedIn" << "\n";
        } else {
            std::cout << "Locked." << "\n";
        }
}

int main () {
    loop();
    nestedLoop();
    whileLoop();
    doWhile();
    return 0;
}
