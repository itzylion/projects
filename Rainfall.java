/*Damon Smith
* Rainfall Average COSC1436
* Homework 2, Problem 1

This program takes monthly rainfall average data from the user over the course of a whole year and relays them the sum of all the averages, the average rainfall,
the highest average rainfall input and the lowest input
inputs: average rainfall for each month
outputs: total, average, highest and lowest
*/
package COSC1436;
import java.util.Scanner;
public class Rainfall {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            
            double[] monthlyAvg = new double[12];
            
            System.out.println("Enter average monthly rainfall: "); // gets user input 
            for(int i = 0; i < monthlyAvg.length; i++){
                monthlyAvg[i] = sc.nextInt();
            }
            double sum = 0;// gets the sum of all inputs 
            for(int i = 0; i < monthlyAvg.length; i++){
                sum += monthlyAvg[i];
            }
            double average = sum / monthlyAvg.length;// calculates avg of inputs
            
            double highest = monthlyAvg[0];
            double lowest = monthlyAvg[0];
            for(int i = 0; i < monthlyAvg.length; i++){
                if(monthlyAvg[i] > highest){ //gets highest input
                    highest = monthlyAvg[i];
                }
                if(monthlyAvg[i] < lowest){// gets lowest input
                    lowest = monthlyAvg[i];
            }
        }
        System.out.println("Total rainfall is: " + sum);
        System.out.println("Average rainfall is: " + average);
        System.out.println("Highest rainfall is: " + highest);
        System.out.println("loest rainfall is: " + lowest);
    }
}
