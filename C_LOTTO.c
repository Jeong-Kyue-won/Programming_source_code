#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SIZE 6

int inputArray() {

    int arr[SIZE];

    srand((int)time(NULL));

    for (int i = 0; i < SIZE; i++)
        arr[i] = (rand() % 45) + 1;

    for (int i = 0; i < SIZE; i++)
        for (int j = i + 1; j < SIZE; j++)
            if (arr[i] == arr[j])
                while (arr[i] == arr[j])
                    arr[j] = (rand() % 45) + 1;

    return arr;
}

int inputNum() {
    srand((int)time(NULL));
    int iNum = (rand() % 45) + 1;
    return iNum;
}

void sortNum(int arr2[SIZE]) {
    int tmp = 0;
    for (int i = 0; i < SIZE - 1; i++)
        for (int j = 0; j < SIZE - 1; j++)
            if (arr2[j] > arr2[j + 1]) {
                tmp = arr2[j];
                arr2[j] = arr2[j + 1];
                arr2[j + 1] = tmp;
            }
}

void showNum(int arr3[SIZE]) {
    for (int i = 0; i < SIZE; i++)
        printf("[%d] number: %d\n", i + 1, arr3[i]);
}

int main() {

    int X = 0;
    int randNum[6], pickNum[6];
    int op = 0, num = 0, i = 0, cnt = 0, bonus = 0, count = 0;
    int* tmp1 = NULL, * tmp2 = NULL;
    bonus = inputNum();
    tmp1 = inputArray();

    for (i = 0; i < SIZE; i++)
        randNum[i] = tmp1[i];

    for (i = 0; i < SIZE; i++)
        if (bonus == randNum[i])
            while (bonus == randNum[i])
                bonus = inputNum();

    printf("1.Direct selection\n2.Random selection\n-> ");
    scanf_s("%d", &op);
    printf("\n");

    switch (op) {

    case 1:
        printf("Enter integer number among 1~45.\n");
        for (i = 0; i < SIZE; i++) {
            printf("Enter [%d] number: ", i + 1);
            scanf_s("%d", &num);

            if (X >= 1)
            {
                for (int j = 0; j < SIZE; j++)
                {
                    while (pickNum[j - 1] == num) {
                        printf("is already entered!!! \nRe-enter number: ");
                        scanf_s("%d", &num);
                    }
                }
            }
            pickNum[i] = num;
            X++;
        }

        printf("\n");
        break;

    case 2:
        tmp2 = inputArray();
        for (i = 0; i < SIZE; i++)
            pickNum[i] = tmp2[i];
        break;

    default:
        printf("ERROR.\n");
    }

    sortNum(randNum);
    sortNum(pickNum);
    printf("-----A winning number-----\n");
    showNum(randNum);
    printf("Bonus Number: %d\n", bonus);
    printf("\n-----Selected Number-----\n");
    showNum(pickNum);

    for (i = 0; i < SIZE; i++) {
        if (pickNum[i] == randNum[i])
            cnt++;
        if (pickNum[i] == bonus)
            count++;
    }


    for (i = 0; i < SIZE; i++)
        if (pickNum[i] == bonus && cnt == 5) {
            printf("\nThe number of corresponding number: %d\n--> 2rd winner !!!!\n== [prize 50,000,000 won]\n", cnt);
            goto END;
        }

    if (cnt == 6)
        printf("\nThe number of corresponding number: %d\n--> 1st winner !!!!!\n== [prize 2,000,000,000 won]\n", cnt);
    else if (cnt == 5) {
        if (count == 1)
            cnt += count;
        printf("\nThe number of corresponding number: %d\n--> 3rd winner !!!\n== [prize 1,500,000 won]\n", cnt);
    }
    else if (cnt == 4) {
        if (count == 1)
            cnt += count;
        printf("\nThe number of corresponding number: %d\n--> 4th winner !!\n== [prize 50,000 won\\]\n", cnt);
    }
    else if (cnt == 3) {
        if (count == 1)
            cnt += count;
        printf("\nThe number of corresponding number: %d\n--> 5th winner !\n== [prize 5,000 won\\]\n", cnt);
    }
    else {
        if (count == 1)
            cnt += count;
        printf("\nThe number of corresponding number: %d\n--> losing ticket\n", cnt);
    }
END:
    return 0;
}