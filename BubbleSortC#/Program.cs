using System;


namespace BubbleSort {
   class Sorter {
      static void Main(string[] args) {
         //Array to sort
         int[] anArray = { 78, 55, 78, 27, 1, 3, 99, 88, 78 };

         //Print Unsorted Array
         Console.WriteLine("Unsorted:");
         foreach (int integer in anArray){
            Console.Write(integer + " ");
         }

         //Classic bubble sort
         for (int i = 0; i <= anArray.Length - 1; i++) { //Repeats n-1 times

            for (int j = 0; j <= anArray.Length - j - 1; j++) { //Bubbles to top until reaches already sorted values

               if (anArray[j] > anArray[j + 1]) { //If n > n+1 we need to swap
                  int temp = anArray[j + 1]; //save old value
                  anArray[j + 1] = anArray[j]; //transfer higher value to higher index
                  anArray[j] = temp; //restore lower value now in lower index
               }
            }
         }

         //print sorted array
         Console.WriteLine("\nSorted:");
         foreach (int p in anArray){
            Console.Write(p + " ");
         }
      }
   }
}
