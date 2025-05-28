/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class LinearSearch {
    private int[] array;

    public LinearSearch(int n) {
        this.array = new int [n];
    }
    

   

    void addValue(int x) { // o day khai bao bien x vi muc dich chinh la gan gia tri ngau nhien cho tung phan tu trong array
        Random rd = new Random() ;//tao doi tuong random
        for (int i=0 ; i<array.length;i++){//duyet qua tung vi tri trong man
            array[i] = rd.nextInt(array.length);//sinh ra cac so ngau nhien tu 0-9 vao cac o tu 0-array[i]
        }
        
        
    }

    void showArray() {
        for(int n: array){
            System.out.print(n +" ");
        }
        System.out.println();
    }

    int searchValue(int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {

                return i;
            }

        }

        return -1;
    }
}
