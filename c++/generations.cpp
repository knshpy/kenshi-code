#include <iostream>

int main() {

    int age = 10;

    std::cout << "I write this code in July 8, 2025 around 11:00 PM" << std::endl;
    std::cout << "And I am gen Z and I am curious" << std::endl;
    std::cout << "Which generation are you from? let's find out!\n" << std::endl;

    if (age >= 62 && age <= 80) {
        std::cout << "Wow you are from the Baby boomer generation, WW2 just ended!" << std::endl;
    } else if (age >= 42 && age <= 61) {
        std:: cout << "Interesting you are from Generation X, There is cold war aahhh!!!" << std::endl;
    } else if (age >= 30 && age <= 41) {
        std::cout <<"OooOOOoooOOOoo Technology is booming" << std::endl; 
    } else if (age >= 14 && age <= 29) {
        std::cout <<"Cool we're in the same generation, you probably build lego sets too!"<< std::endl;
    } else if (age >= 1 && age <= 13) {
        std::cout <<"Say Hello to artificial intelligence, you are the youngest so far!" << std::endl;
    } else {
        std::cout <<"It is either you are vampire or only months old, please try again:)" << std::endl;
    }
    
    return 0;
}