/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class BubbleSort {
      private int array[];

    public BubbleSort() {
    }
    
        public BubbleSort(int[] array) {
        this.array = array;
    }
    
    public void createRandomArray(int size) {
        array = new int[size];
        Random rd = new Random();
        
        for(int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(array.length);
        }
    }
    
    void displayArray() {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
    
    void sort(){
        int n = array.length;
        
        for ( int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                
                if( array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public int[] getArray() {
        return array;
    }
}
