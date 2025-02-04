#include <stdio.h>

void bubbleSort(int arr[], int dim)
{
    int y =0, temp= 0;
    int scambio = 0;
    do
    {
        scambio = 0;
        for (y = 0; y < dim; y++)
        {
            if (arr[y] > arr[y + 1])
            {
                temp = arr[y];
                arr[y] = arr[y + 1];
                arr[y + 1] = temp;
                scambio = 1;
            }
        }
        dim--;
    } while (scambio == 1);
}

int main()
{
    int array[10] = {1,2,3,4,5,6,7,8,9,10};
    for (int i = 0; i < 10; i++)
    {
        printf("%d ", array[i]);
    }

    
    for (int i = 0; i < 10; i++)
    {
        printf("%d ", newArray[i]);
    }


    


}