/*Damon Smith
* ArrayMultiplication COSC1436
* Homework 2, Problem 3

This program generates random ints set up in a 3x3 mulitplied by each other 
inputs: random ints in a 3x3
outputs: the product of the two arrays being multiplied
*/

package COSC1436;
import java.lang.Math;
public class Arraymultiplication {
    public static void main(String args[]){

        double[][] array1 = new double[3][3];
        double[][] array2 = new double[3][3];
        double[][] array3 = new double[3][3];

         // randomly generates for array1
            for(int i = 0; i < array1.length; i++){
               for(int j = 0; j < array1.length; j++){
                   array1[i][j] = Math.random() * 10;
               }
            }
         // randomly generates for array2
            for(int i = 0; i < array2.length; i++){
               for(int j = 0; j < array2.length; j++){
                   array2[i][j] = Math.random() * 10;
               } 
            }
            for(int i = 0; i < 3; i++){//mulitplying of the two arrays
                for(int j = 0; j < 3; j++){
                    array3[i][j] = 0;
                    for(int k = 0; k < 3; k++)
                    {
                        array3[i][j] += array1[i][k]*array2[k][j];
                    }
                    System.out.print(String.format("%.2f",array3[i][j]) + " ");
                }
                System.out.println(); //the range of the multiplication is 10
            } 
    }
}
