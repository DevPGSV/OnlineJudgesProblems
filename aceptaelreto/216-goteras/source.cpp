
#include <iostream>
#include <stdio.h>

int main() {

    int tests, drops;

    std::cin >> tests;

    for (int i = 0; i < tests; i++) {

        std::cin >> drops;
        printf("%02d:%02d:%02d\n", (drops / 60) / 60, (drops / 60) % 60, drops % 60);

    }

    return 0;
}
