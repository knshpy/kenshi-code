#include <iostream>
#include <string>

void array() {
    int arr[5] = {11, 22, 33, 44, 55};
        for (int i = 0; i < 5; i++) {
            std::cout << arr[i] << " ";
        }
        std::cout << " " << std::endl; // New line
}

void relay() {
    std::string names[4] = {"Phelps", "Peaty", "McEvoy", "Ceccon"};
        std::cout << names[1] << " " << names[3] << std::endl;

}

void multidimension() {
    int numbers[3][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            std::cout << numbers[i][j] << " ";
        }
        std::cout << " " << std::endl;
    }
}

void ijk() {
    int numbers[3][3][3] = {
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        },
        {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        },
        {
            {19, 20, 21},
            {22, 23, 24},
            {25, 26, 27}
        }
    };
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    std::cout << numbers[i][j][k] << " ";
                }
                std::cout << " " << std::endl;
            }
        }
    }


int main () {
    std::cout << "Hii guys!" << std::endl;
    array();
    relay();
    multidimension();
    ijk();
    return 0;
}