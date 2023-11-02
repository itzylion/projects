/*Damon Smith
* ArrayAddition COSC1436
* Homework 2, Problem 2

This program generates a randomized 3x3 diagram and adds all the integers
inputs: random ints
outputs: sum of random ints in a 3x3
*/
package COSC1436;
import java.lang.Math;
public class arrayaddition {
        public static void main(String args[]){

            double[][] array1 = new double[3][3];
            double[][] array2 = new double[3][3];
            double[][] array3 = new double[3][3];

             // randomly generates numbers for array1
            for(int i = 0; i < array1.length; i++){
               for(int j = 0; j < array1.length; j++){
                   array1[i][j] = Math.random() * 10;
               }
            }
             //radnomly generates numbers for array2
            for(int i = 0; i < array2.length; i++){
               for(int j = 0; j < array2.length; j++){
                   array2[i][j] = Math.random() * 10;
               } 
            } 
            for(int i = 0; i < array1.length; i++){// adds values of the arrays
               for(int j = 0; j < array1.length; j++){
                   array3[i][j] = array1[i][j] + array2[i][j];;
               }

            }
            for(int i = 0; i < array1.length; i++){ //prints out result
               for(int j = 0; j < array1.length; j++){
                   System.out.print(String.format("%.2f",array3[i][j]) + " "); //adding space in array3 making it look all pretty
               }
               System.out.print("\n");
            }
     }
 }

