/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--------MENU--------");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Binary Search");
            System.out.println("4. Stack Operations");
            System.out.println("5. Exit");
            System.out.print("Select option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1: {
                    BubbleSort bubble = new BubbleSort();
                    System.out.print("Enter array size: ");
                    int n = sc.nextInt();
                    bubble.createRandomArray(n);
                    System.out.println("Original array:");
                    bubble.displayArray();
                    bubble.sort();
                    System.out.println("\nSorted array:");
                    bubble.displayArray();
                    break;
                }

                case 2: {
                    QuickSort quick = new QuickSort();
                    System.out.print("Enter array size: ");
                    int n = sc.nextInt();
                    quick.createArray(n);
                    int[] arr = quick.getArray();
                    System.out.println("Original array:");
                    quick.display();
                    quick.quickSort(arr, 0, arr.length - 1);
                    System.out.println("\nSorted array:");
                    quick.display();
                    break;
                }

                case 3: {
                    QuickSort quick = new QuickSort();
                    BinarySearch bs = new BinarySearch();

                    System.out.print("Enter array size: ");
                    int n = sc.nextInt();
                    System.out.print("Enter number to search: ");
                    int key = sc.nextInt();

                    quick.createArray(n);
                    int[] arr = quick.getArray();
                    quick.quickSort(arr, 0, arr.length - 1);

                    System.out.println("Sorted array:");
                    quick.display();

                    int found = bs.search(arr, key);
                    if (found != -1) {
                        System.out.println("\nFound at index: " + found);
                    } else {
                        System.out.println("\nNot found.");
                    }

                    break;
                }

                case 4: {
                    Stack stack = new Stack();

                    while (true) {
                        System.out.println("\n-- Stack Operations --");
                        System.out.println("1. Push");
                        System.out.println("2. Pop");
                        System.out.println("3. Get Top");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Choose an option: ");
                        int n = sc.nextInt();

                        switch (n) {
                            case 1:
                                System.out.print("Enter a value to push: ");
                                int value = sc.nextInt();
                                stack.push(value);
                                break;
                            case 2:
                                try {
                                    System.out.println("Popped value: " + stack.pop());
                                } catch (EmptyStackException e) {
                                    System.out.println("Stack is empty.");
                                }
                                break;
                            case 3:
                                try {
                                    System.out.println("Top value: " + stack.get());
                                } catch (EmptyStackException e) {
                                    System.out.println("Stack is empty.");
                                }
                                break;
                            case 4:
                                System.out.println("Returning to main menu...");
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                        }

                        if (n == 4) break;
                    }

                    break;
                }

                case 5:
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
